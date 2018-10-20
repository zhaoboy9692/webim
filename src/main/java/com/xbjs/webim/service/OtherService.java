package com.xbjs.webim.service;

import com.xbjs.webim.pojo.ChatlogResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/10
 * @description:
 */
public interface OtherService {
    void uploadFile(MultipartFile multipartFile) throws IOException;

    List<ChatlogResult> getChatLog(Long id, String type, Long userId);
}

