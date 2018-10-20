package com.xbjs.webim.pojo;

import com.google.gson.annotations.SerializedName;

public class ImChatlog {
    private Long chatlogid;

    @SerializedName("from")
    private Long fromid;

    @SerializedName("to")
    private Long toid;

    private String content;

    private Long sendtime;

    @SerializedName("type")
    private String typ;

    private Integer status;

    public Long getChatlogid() {
        return chatlogid;
    }

    public void setChatlogid(Long chatlogid) {
        this.chatlogid = chatlogid;
    }

    public Long getFromid() {
        return fromid;
    }

    public void setFromid(Long fromid) {
        this.fromid = fromid;
    }

    public Long getToid() {
        return toid;
    }

    public void setToid(Long toid) {
        this.toid = toid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getSendtime() {
        return sendtime;
    }

    public void setSendtime(Long sendtime) {
        this.sendtime = sendtime;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ == null ? null : typ.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ImChatlog{" +
                "chatlogid=" + chatlogid +
                ", fromid=" + fromid +
                ", toid=" + toid +
                ", content='" + content + '\'' +
                ", sendtime=" + sendtime +
                ", typ='" + typ + '\'' +
                ", status=" + status +
                '}';
    }
}