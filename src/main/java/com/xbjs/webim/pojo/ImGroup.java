package com.xbjs.webim.pojo;

import com.google.gson.annotations.SerializedName;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
public class ImGroup {
    @SerializedName("id")
    private Long groupId;

    private String groupname;

    private String avatar;

    private String notice;

    private transient String userId;

    private Integer approval;

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * Gets groupname.
     *
     * @return the groupname
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * Sets groupname.
     *
     * @param groupname the groupname
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Sets avatar.
     *
     * @param avatar the avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * Gets notice.
     *
     * @return the notice
     */
    public String getNotice() {
        return notice;
    }

    /**
     * Sets notice.
     *
     * @param notice the notice
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * Gets approval.
     *
     * @return the approval
     */
    public Integer getApproval() {
        return approval;
    }

    /**
     * Sets approval.
     *
     * @param approval the approval
     */
    public void setApproval(Integer approval) {
        this.approval = approval;
    }
}