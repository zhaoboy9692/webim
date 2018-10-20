package com.xbjs.webim.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
public class GroupResult {

    private List<ImUser> list=new ArrayList<>();

    public List<ImUser> getList() {
        return list;
    }

    public void setList(List<ImUser> list) {
        this.list = list;
    }


}

