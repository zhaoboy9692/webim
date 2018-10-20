package com.xbjs.webim.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MsgBoxResult {
    private int code;

    private String msg;

    private List<ImMsgbox> data;

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

    public List<ImMsgbox> getData() {
        return data;
    }

    public void setData(List<ImMsgbox> data) {
        this.data = data;
    }
}
