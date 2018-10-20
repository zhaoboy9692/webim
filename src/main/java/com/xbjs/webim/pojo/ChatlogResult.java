package com.xbjs.webim.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/29
 * @description:
 */
public class ChatlogResult {

    private String username;

    private String msg="";

    private String avatar;

    private String content;

    private Long timestamp;

    private Long id;

    private Long code=0l;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "ChatlogResult{" +
                "username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", id=" + id +
                '}';
    }

}

