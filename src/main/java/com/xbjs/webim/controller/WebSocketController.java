package com.xbjs.webim.controller;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.xbjs.webim.pojo.ChatMessageResult;
import com.xbjs.webim.pojo.ImGroupUser;
import com.xbjs.webim.service.UserService;
import com.xbjs.webim.service.WebSocketService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;


/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018 /9/4
 * @description:
 */
@ServerEndpoint(value = "/websocket/{userId}")
@Component
public class WebSocketController {
    /*
     *concurrent包的线程安全Map，用来存放每个客户端对应的MyWebSocket对象。
     */

    private static Map<Long, WebSocketController> webSocketmap = new ConcurrentHashMap<Long, WebSocketController>();

    /*
     *与某个客户端的连接会话，需要通过它来给客户端发送数据
     */

    private Session session;

    /*
     *静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
     */

    private static int onlineUser;

    /*
     *此处是解决无法注入的
     */

    private static ApplicationContext applicationContext;


    private WebSocketService webSocketService;

    private UserService userService;

    /*
     *当前用户id
     */

    private Long userId;

    /**
     * 连接建立成功调用的方法
     */

    @OnOpen
    public void onOpen(@PathParam("userId") Long userId, Session session) {
        onlineUser++;
        this.session = session;
        this.userId = userId;
        //把自己的信息加入map
        webSocketmap.put(userId, this);
        userService = applicationContext.getBean(UserService.class);
        userService.updateUserStatus(userId, "online");
        webSocketService = applicationContext.getBean(WebSocketService.class);
        List<ChatMessageResult> chatMessageResultList = webSocketService.getUnreadMessage(userId);
        for (ChatMessageResult aChatMessageResultList : chatMessageResultList) {
            sendMessageTo(aChatMessageResultList, userId);
        }
        System.out.println("有新连接加入！当前在线人数为：" + onlineUser);
    }

    /**
     * 连接关闭调用的方法
     */

    @OnClose
    public void onClose() {
        onlineUser--;
        webSocketmap.remove(userId);
        userService = applicationContext.getBean(UserService.class);
        userService.updateUserStatus(userId, "hide");
        System.out.println("websocket close 当前在线人数为：" + onlineUser);
    }

    /*
     *收到客户端消息
     */

    @OnMessage
    public void onMessage(String message, Session session) {
        //注入service必须添加
        webSocketService = applicationContext.getBean(WebSocketService.class);
        userService = applicationContext.getBean(UserService.class);
        //获取Json数据
        JsonObject jsonObject = new JsonParser().parse(message).getAsJsonObject();
        JsonObject jsonObjectTo = null;
        //判断消息类型打开窗口还是聊天
        if ("chatMessage".equals(jsonObject.get("type").getAsString())) {
            jsonObjectTo = jsonObject.get("data").getAsJsonObject().get("to").getAsJsonObject();
            long toId = jsonObjectTo.get("id").getAsLong();
            String toType = jsonObjectTo.get("type").getAsString();
            //好友消息
            if (null != webSocketmap.get(toId) & "friend".equals(toType)) {
                webSocketService.addChatLog(message, 0);
                sendMessageTo(webSocketService.getChatMessage(message), toId);
                // 群组消息
            } else if ("group".equals(toType)) {
                System.out.println("群组消息");
                webSocketService.addChatLog(message, 1);
                ListIterator<Long> listIterator = webSocketService.getGroupUserId(toId).listIterator();
                for (Long aLong : webSocketmap.keySet()) {
                    if (userId.equals(aLong)) {
                        continue;
                    }
                    ChatMessageResult chatMessageResult = webSocketService.getChatMessage(message);
                    chatMessageResult.setId(toId + "");
                    sendMessageTo(chatMessageResult, aLong);
                }

                //用户下线做的处理
            } else {
                webSocketService.addChatLog(message, 0);
            }
            //窗口打开代表消息被读,
        } else if ("chatChange".equals(jsonObject.get("type").getAsString())) {
            jsonObjectTo = jsonObject.get("data").getAsJsonObject();
            if ("friend".equals(jsonObjectTo.get("type").getAsString())) {
                long touserId = jsonObjectTo.get("id").getAsLong();
                webSocketService.updateUnreadMessageStatus(touserId, userId);
                //向用户推送该好友是否在线
                sendMessageTo(userService.getUserState(touserId), userId);
            } else if ("group".equals("")) {
                System.out.println("群组");
            }
        }

    }

    /*
     *服务端发生异常
     */

//    @OnError
//    public void onError(Session session, Throwable throwable) {
//        System.out.println("服务端发生异常");
//    }

    /*
     * 向用户发送消息类型
     */


    public void sendMessageTo(ChatMessageResult message, Long toId) {
        for (WebSocketController item : webSocketmap.values()) {
            if (item.userId.equals(toId)) {
                try {
                    item.session.getAsyncRemote().sendText(new Gson().toJson(message));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }



    /*
     *向所有在线用户通知
     */

    public void sendMessageAll(String message, String fromUserId) throws IOException {
        for (WebSocketController item : webSocketmap.values()) {
            item.session.getAsyncRemote().sendText(message);
        }
    }


    public static synchronized int getOnlineUser() {
        return onlineUser;
    }

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

}

