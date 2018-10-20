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
public class MineResult {
    private ImUser mine;
    private List<ImMyFz> friend=new ArrayList<>();
    private List<ImGroup> group=new ArrayList<>();

    public ImUser getMine() {
        return mine;
    }

    public void setMine(ImUser mine) {
        this.mine = mine;
    }

    public List<ImMyFz> getFriend() {
        return friend;
    }

    public void setFriend(List<ImMyFz> friend) {
        this.friend = friend;
    }

    public List<ImGroup> getGroup() {
        return group;
    }

    public void setGroup(List<ImGroup> group) {
        this.group = group;
    }
}
