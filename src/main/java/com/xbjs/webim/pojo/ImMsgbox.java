package com.xbjs.webim.pojo;

public class ImMsgbox {
    private Long boxId;

    private Long uid;

    private Long fromid;

    private Long fromGroup;

    private Integer typ;

    private String remark;

    private String href;

    private Short read;

    private Long time;

    private ImUser imUser;

    public ImUser getImUser() {
        return imUser;
    }

    public void setImUser(ImUser imUser) {
        this.imUser = imUser;
    }

    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getFromid() {
        return fromid;
    }

    public void setFromid(Long fromid) {
        this.fromid = fromid;
    }

    public Long getFromGroup() {
        return fromGroup;
    }

    public void setFromGroup(Long fromGroup) {
        this.fromGroup = fromGroup;
    }

    public Integer getTyp() {
        return typ;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public Short getRead() {
        return read;
    }

    public void setRead(Short read) {
        this.read = read;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}