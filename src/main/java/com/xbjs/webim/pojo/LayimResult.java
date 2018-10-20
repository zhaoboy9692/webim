package com.xbjs.webim.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
public class  LayimResult {
    private int code;
    private String msg;
    @SerializedName("data")
    private  MineResult mineResult;

    public MineResult getMineResult() {
        return mineResult;
    }

    public void setMineResult(MineResult mineResult) {
        this.mineResult = mineResult;
    }

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


}
