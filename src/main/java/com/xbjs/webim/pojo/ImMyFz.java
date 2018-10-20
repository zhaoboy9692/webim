package com.xbjs.webim.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
public class ImMyFz {

    @SerializedName("id")
    private Long fzId;

    @SerializedName("groupname")
    private String fzGroupname;

    @SerializedName("list")
    private List<ImUser> imUsers=new ArrayList<>();

    public List<ImUser> getImUsers() {
        return imUsers;
    }

    public void setImUsers(List<ImUser> imUsers) {
        this.imUsers = imUsers;
    }

    public Long getFzId() {
        return fzId;
    }

    public void setFzId(Long fzId) {
        this.fzId = fzId;
    }

    public String getFzGroupname() {
        return fzGroupname;
    }

    public void setFzGroupname(String fzGroupname) {
        this.fzGroupname = fzGroupname == null ? null : fzGroupname.trim();
    }

    @Override
    public String toString() {
        return "ImMyFz{" +
                "fzId=" + fzId +
                ", fzGroupname='" + fzGroupname + '\'' +
                ", imUsers=" + imUsers +
                '}';
    }
}