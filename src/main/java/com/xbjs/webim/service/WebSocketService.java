package com.xbjs.webim.service;

import com.xbjs.webim.pojo.ChatMessageResult;
import com.xbjs.webim.pojo.ImGroupUser;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018 /9/4
 * @description:
 */
public interface WebSocketService {

    /**
     * Gets chat message.
     *
     * @param mesage the mesage
     * @return the chat message
     */
    ChatMessageResult getChatMessage(String mesage);

    /**
     * Gets group user id.
     *
     * @param toId the to id
     * @return the group user id
     */
    List<Long> getGroupUserId(Long toId);

    /**
     * Add char log.
     *
     * @param message the message
     * @param i       the
     */
    void addChatLog(String message, int i);

    /**
     * Gets unread message.
     *
     * @param userId the user id
     * @return the unread message
     */
    List<ChatMessageResult> getUnreadMessage(Long userId);

 
    /**
     * Update unread message status.
     *
     * @param fromId the from id
     * @param toId   the to id
     */
    void updateUnreadMessageStatus(long fromId, Long toId);
}
