package com.xbjs.webim.service.serviceimpl;

import com.xbjs.webim.mapper.ImChatlogMapper;
import com.xbjs.webim.mapper.ImGroupMapper;
import com.xbjs.webim.mapper.ImGroupUserMapper;
import com.xbjs.webim.mapper.ImUserMapper;
import com.xbjs.webim.pojo.*;
import com.xbjs.webim.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/10
 * @description:
 */
@Service
public class OtherServiceImpl implements OtherService {
    @Autowired
    private ImChatlogMapper imChatlogMapper;
    @Autowired
    private ImUserMapper imUserMapper;
    @Autowired
    private ImGroupUserMapper imGroupUserMapper;
    @Autowired
    private ImGroupMapper imGroupMapper;

    @Override
    public void uploadFile(MultipartFile multipartFile) {
        if (multipartFile.isEmpty()) {
            return;
        }
        try {
            long begimTime = System.currentTimeMillis();
            byte[] bytes = multipartFile.getBytes();
            Path path = Paths.get(multipartFile.getOriginalFilename());
            Files.write(path, bytes);
            System.out.println(System.currentTimeMillis() - begimTime);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<ChatlogResult> getChatLog(Long toid, String type, Long userId) {
        ImChatlogExample imChatlogExample = new ImChatlogExample();
        ImGroupUserExample imGroupUserExample = new ImGroupUserExample();
        //我发送的
        List<ImChatlog> meChatlogList = new ArrayList<>();
        List<ImChatlog> chatlogList = new ArrayList<>();
        if ("group".equals(type)) {
            //查询所有
            imChatlogExample.createCriteria().andToidEqualTo(toid).andTypEqualTo(type);
            chatlogList = imChatlogMapper.selectByExample(imChatlogExample);
        } else if ("friend".equals(type)) {
            imChatlogExample.createCriteria().andToidEqualTo(toid).andFromidEqualTo(userId).andTypEqualTo(type);
            meChatlogList = imChatlogMapper.selectByExample(imChatlogExample);
            imChatlogExample.clear();
            //好友向我发送的
            imChatlogExample.createCriteria().andToidEqualTo(userId).andFromidEqualTo(toid).andTypEqualTo(type);
            chatlogList = imChatlogMapper.selectByExample(imChatlogExample);
        }
        return this.getChatLog(meChatlogList, chatlogList);

    }


    public List<ChatlogResult> getChatLog(List<ImChatlog> meChatlogList, List<ImChatlog> chatlogList) {
        List<ChatlogResult> chatlogResultList = new ArrayList<>();
        List<ImChatlog> imChatlogList = new ArrayList<>();
        imChatlogList.addAll(meChatlogList);
        imChatlogList.addAll(chatlogList);
        for (ImChatlog imChatlog : imChatlogList) {
            ChatlogResult chatlogResult = new ChatlogResult();
            ImUser imUser = imUserMapper.selectByPrimaryKey(imChatlog.getFromid());
            chatlogResult.setId(imUser.getId());
            chatlogResult.setUsername(imUser.getUsername());
            chatlogResult.setAvatar(imUser.getAvatar());
            chatlogResult.setTimestamp(imChatlog.getSendtime());
            chatlogResult.setContent(imChatlog.getContent());
            chatlogResultList.add(chatlogResult);
        }
        //lamdba表达式比较大小
        Collections.sort(chatlogResultList, Comparator.comparing(ChatlogResult::getTimestamp).thenComparing(ChatlogResult::getTimestamp).reversed());
        return chatlogResultList;
    }
}

