package com.xbjs.webim.service.serviceimpl;

import com.google.gson.Gson;
import com.xbjs.webim.common.ChatMessage;
import com.xbjs.webim.mapper.ImChatlogMapper;
import com.xbjs.webim.mapper.ImGroupMapper;
import com.xbjs.webim.mapper.ImGroupUserMapper;
import com.xbjs.webim.mapper.ImUserMapper;
import com.xbjs.webim.pojo.*;
import com.xbjs.webim.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018 /8/2
 * @description:
 */
@Service
public class WebSocketServiceImpl implements WebSocketService {

    @Autowired
    private ImUserMapper imUserMapper;
    @Autowired
    private ImGroupMapper imGroupMapper;

    @Autowired
    private ImChatlogMapper imChatlogMapper;

    @Autowired
    private Gson gson;

    @Autowired
    private ImGroupUserMapper imGroupUserMapper;


    @Override
    public ChatMessageResult getChatMessage(String message) {
        ChatMessage chatMessage = new ChatMessage();
        return chatMessage.getChatMessage(message);
    }

    @Override
    public List<Long> getGroupUserId(Long toId) {
        if (null == toId) {
            return null;
        }
        ImGroupUserExample imGroupUserExample = new ImGroupUserExample();
        imGroupUserExample.createCriteria().andGroupIdEqualTo(toId);
        List list = new ArrayList();
        for (ImGroupUser imGroupUser : imGroupUserMapper.selectByExample(imGroupUserExample)) {
            list.add(imGroupUser.getUserId());
        }
        ImGroup lord = imGroupMapper.selectByPrimaryKey(toId);
        if (null != lord) {
            list.add(Long.valueOf(lord.getUserId()));
        }
        return list;
    }

    @Override
    public void addChatLog(String message, int i) {
        ChatMessage chatMessage = new ChatMessage();
        imChatlogMapper.insert(chatMessage.setChatLog(message, i));
    }

    @Override
    public List<ChatMessageResult> getUnreadMessage(Long userId) {
        ImChatlogExample imChatlogExample = new ImChatlogExample();
        imChatlogExample.createCriteria().andToidEqualTo(userId).andStatusEqualTo(0);
        return this.getChatHistoryMessage(imChatlogMapper.selectByExample(imChatlogExample));
    }

    @Override
    public void updateUnreadMessageStatus(long fromId, Long toId) {
        ImChatlogExample imChatlogExample = new ImChatlogExample();
        ImChatlog imChatlog = new ImChatlog();
        imChatlogExample.createCriteria().andToidEqualTo(toId).andFromidEqualTo(fromId);
        imChatlog.setStatus(1);
        imChatlog.setFromid(fromId);
        imChatlog.setToid(toId);
        imChatlogMapper.updateByExampleSelective(imChatlog, imChatlogExample);
    }


    public List<ChatMessageResult> getChatHistoryMessage(List<ImChatlog> imChatlogs) {
        List<ChatMessageResult> chatMessageResultList = new LinkedList<>();
        ImUser imUser = new ImUser();
        ChatMessageResult chatMessageResult = new ChatMessageResult();
        for (ImChatlog imChatlog : imChatlogs) {
            imUser = imUserMapper.selectByPrimaryKey(imChatlog.getFromid());
            chatMessageResult.setUsername(imUser.getUsername());
            chatMessageResult.setAvatar(imUser.getAvatar());
            chatMessageResult.setFromid(imChatlog.getFromid() + "");
            chatMessageResult.setId(imChatlog.getFromid() + "");
            chatMessageResult.setContent(imChatlog.getContent());
            chatMessageResult.setType(imChatlog.getTyp());
            chatMessageResult.setTimestamp(imChatlog.getSendtime());
            chatMessageResult.setChatType("chatMessage");
            chatMessageResultList.add(chatMessageResult);
        }
        return chatMessageResultList;
    }

}