package com.xbjs.webim.common;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.xbjs.webim.pojo.ChatMessageResult;
import com.xbjs.webim.pojo.ChatlogResult;
import com.xbjs.webim.pojo.ImChatlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018 /9/6
 */
@Component
public class ChatMessage {
    @Autowired
    private Gson gson;


    /**
     * 组装聊天信息
     *
     * @param message the message
     * @return the chat message
     */
    public ChatMessageResult getChatMessage(String message) {
        ChatMessageResult chatMessageResult = new ChatMessageResult();
        JsonObject jsonObject = new JsonParser().parse(message).getAsJsonObject();
        JsonObject minData = jsonObject.get("data").getAsJsonObject().get("mine").getAsJsonObject();
        JsonObject toData = jsonObject.get("data").getAsJsonObject().get("to").getAsJsonObject();
        //chatMessageResult.setFromid(minData.get("id").getAsString());
        chatMessageResult.setUsername(minData.get("username").getAsString());
//        chatMessageResult.setMine(minData.get("mine").getAsBoolean());
        chatMessageResult.setId(minData.get("id").getAsString());
        chatMessageResult.setContent(minData.get("content").getAsString());
        chatMessageResult.setAvatar(minData.get("avatar").getAsString());
        chatMessageResult.setTimestamp(System.currentTimeMillis());
        chatMessageResult.setType(toData.get("type").getAsString());
        chatMessageResult.setChatType("chatMessage");
        return chatMessageResult;
    }

    public ImChatlog setChatLog(String message, int status) {

        ImChatlog imChatlog = new ImChatlog();
        JsonObject jsonObject = new JsonParser().parse(message).getAsJsonObject();
        JsonObject minData = jsonObject.get("data").getAsJsonObject().get("mine").getAsJsonObject();
        JsonObject toData = jsonObject.get("data").getAsJsonObject().get("to").getAsJsonObject();
        imChatlog.setContent(minData.get("content").getAsString());
        imChatlog.setFromid(minData.get("id").getAsLong());
        imChatlog.setSendtime(System.currentTimeMillis());
        imChatlog.setTyp(toData.get("type").getAsString());
        imChatlog.setToid(toData.get("id").getAsLong());
        imChatlog.setStatus(status);
        return imChatlog;
    }



}

