package com.xbjs.webim.service.serviceimpl;

import com.xbjs.webim.mapper.*;
import com.xbjs.webim.pojo.*;
import com.xbjs.webim.pojo.ImUserExample.Criteria;
import com.xbjs.webim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/8/2
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ImUserMapper imUserMapper;
    @Autowired
    private ImMyFzMapper imMyFzMapper;
    @Autowired
    private ImUserFzMapper imUserFzMapper;
    @Autowired
    private ImMyFriendMapper imMyFriendMapper;
    @Autowired
    private ImGroupMapper imGroupMapper;
    @Autowired
    private ImGroupUserMapper imGroupUserMapper;

    /*
     *用户登录
     */

    @Override
    public boolean userLogin(ImUser imUser) {
        ImUserExample imUserExample = new ImUserExample();
        Criteria criteria = imUserExample.createCriteria();
        criteria.andIdEqualTo(imUser.getId()).andPassEqualTo(imUser.getPass());
        List<ImUser> list = imUserMapper.selectByExample(imUserExample);
        return list != null && list.size() != 0;
    }

    /*
     *处理登陆之后面板信息
     * 这里用sql语句写比这个简单
     */

    @Override
    public LayimResult getUserInfo(Long userId) {
        LayimResult layimResult = new LayimResult();
        MineResult mineResult = new MineResult();
        ImMyFriendExample imMyFriendExample = new ImMyFriendExample();
        ImUserFzExample imUserFzExample = new ImUserFzExample();
        ImGroupExample imGroupExample = new ImGroupExample();
        //--------面板的分组信息-------
        List<ImMyFz> imMyFzList = new ArrayList<>();
        //根据imuserfz查询分组信息
        imUserFzExample.createCriteria().andUserIdEqualTo(userId);
        List<ImUserFz> imUserFzList = imUserFzMapper.selectByExample(imUserFzExample);
        for (int i = 0; i < imUserFzList.size(); i++) {
            //获取分组信息
            ImMyFz imMyFz = imMyFzMapper.selectByPrimaryKey(imUserFzList.get(i).getFzId());
            //根据分组id获取好友id
            imMyFriendExample.createCriteria().andMyFzIdEqualTo(imMyFz.getFzId());
            List<ImMyFriend> imMyFriendList = imMyFriendMapper.selectByExample(imMyFriendExample);
            //清理上一次的查询
            imMyFriendExample.clear();
            //根据好友id获取好友信息
            for (int j = 0; j < imMyFriendList.size(); j++) {
                ImUser imFriend = imUserMapper.selectByPrimaryKey(imMyFriendList.get(j).getUserId());
                if (null != imMyFriendList.get(j).getNickname()) {
                    //有备注显示备注
                    imFriend.setUsername(imMyFriendList.get(j).getNickname());
                }
                imMyFz.getImUsers().add(imFriend);
            }
            imMyFzList.add(imMyFz);
        }
        //将分组和好友信息设置到面板
        mineResult.setFriend(imMyFzList);

        //-------面板的群组信息-------群主
        imGroupExample.createCriteria().andUserIdEqualTo(userId);
        mineResult.setGroup(imGroupMapper.selectByExample(imGroupExample));
        imGroupExample.clear();
        //-----群员----
        ImGroupUserExample imGroupUserExample = new ImGroupUserExample();
        imGroupUserExample.createCriteria().andUserIdEqualTo(userId);
        List<ImGroupUser> imGroupList = imGroupUserMapper.selectByExample(imGroupUserExample);
        for (ImGroupUser imGroupUser : imGroupList) {
            mineResult.getGroup().add(imGroupMapper.selectByPrimaryKey(imGroupUser.getGroupId()));
        }
        //-----组装数据-------
        layimResult.setCode(0);
        layimResult.setMsg("success");
        mineResult.setMine(imUserMapper.selectByPrimaryKey(userId));
        layimResult.setMineResult(mineResult);
        return layimResult;
    }

    @Override
    public MermbersResult getMembersInfo(long groupId) {
        ImGroupUserExample imGroupUserExample = new ImGroupUserExample();
        GroupResult groupResult = new GroupResult();
        MermbersResult mermbersResult = new MermbersResult();
        imGroupUserExample.createCriteria().andGroupIdEqualTo(groupId);
        //设置群主信息
        ImUser lord = imUserMapper.selectByPrimaryKey(Long.valueOf(imGroupMapper.selectByPrimaryKey(groupId).getUserId()));
        lord.setUsername("群主:" + lord.getUsername());
        groupResult.getList().add(lord);
        //根据群组查询群员信息
        List<ImGroupUser> imGroupUserList = imGroupUserMapper.selectByExample(imGroupUserExample);
        for (ImGroupUser imGroupUser : imGroupUserList) {
            ImUser imUser = imUserMapper.selectByPrimaryKey(imGroupUser.getUserId());
            if (null == imGroupUser.getNickname() || "".equals(imGroupUser.getNickname())) {
                groupResult.getList().add(imUser);
            } else {
                imUser.setUsername(imGroupUser.getNickname());
                groupResult.getList().add(imUser);
            }
        }
        mermbersResult.setData(groupResult);
        mermbersResult.setCode(0);
        mermbersResult.setMsg("success");
        return mermbersResult;
    }

    @Override
    public int updateUserStatus(Long userId, String status) {
        ImUserExample imUserExample = new ImUserExample();
        imUserExample.createCriteria().andIdEqualTo(userId);
        ImUser imUser = new ImUser();
        imUser.setStatus(status);
        return imUserMapper.updateByExampleSelective(imUser, imUserExample);
    }

    @Override
    public ChatMessageResult getUserState(Long toUserId) {
        ChatMessageResult chatMessageResult = new ChatMessageResult();
        chatMessageResult.setChatType("status");
        chatMessageResult.setOther(imUserMapper.selectByPrimaryKey(toUserId).getStatus());
        chatMessageResult.setId(toUserId.toString());
        return chatMessageResult;
    }

    @Override
    public int updateUserSign(Long userId, String sign) {
        ImUserExample imUserExample = new ImUserExample();
        imUserExample.createCriteria().andIdEqualTo(userId);
        ImUser imUser = new ImUser();
        imUser.setSign(sign);
        return imUserMapper.updateByExampleSelective(imUser, imUserExample);
    }
}


