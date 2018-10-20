package com.xbjs.webim.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
public class MermbersResult {
    private int code;

    private String msg;

    @SerializedName("data")
    private GroupResult data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public GroupResult getData() {
        return data;
    }

    public void setData(GroupResult data) {
        this.data = data;
    }

}

