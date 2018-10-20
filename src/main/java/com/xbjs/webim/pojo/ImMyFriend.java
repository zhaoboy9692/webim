package com.xbjs.webim.pojo;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
public class ImMyFriend {
    private Long myFriendId;

    private Long myFzId;

    private Long userId;

    private String nickname;

    public Long getMyFriendId() {
        return myFriendId;
    }

    public void setMyFriendId(Long myFriendId) {
        this.myFriendId = myFriendId;
    }

    public Long getMyFzId() {
        return myFzId;
    }

    public void setMyFzId(Long myFzId) {
        this.myFzId = myFzId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    @Override
    public String toString() {
        return "ImMyFriend{" +
                "myFriendId=" + myFriendId +
                ", myFzId=" + myFzId +
                ", userId=" + userId +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}