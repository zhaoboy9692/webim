package com.xbjs.webim.service;

import com.xbjs.webim.pojo.ChatMessageResult;
import com.xbjs.webim.pojo.ImUser;
import com.xbjs.webim.pojo.LayimResult;
import com.xbjs.webim.pojo.MermbersResult;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018 /8/2
 * @description:
 */
public interface UserService {
    /**
     * User login boolean.
     *
     * @param imUser the im user
     * @return the boolean
     */
    boolean userLogin(ImUser imUser);

    /**
     * Gets user info.
     *
     * @param id the id
     * @return the user info
     */
    LayimResult getUserInfo(Long id);

    /**
     * Gets members info.
     *
     * @param l the l
     * @return the members info
     */
    MermbersResult getMembersInfo(long l);

    /**
     * Sets user status.
     *
     * @param userId the user id
     * @param status the status
     */
    int updateUserStatus(Long userId, String status);

    ChatMessageResult getUserState(Long id);

    int updateUserSign(Long userId, String sign);
}
