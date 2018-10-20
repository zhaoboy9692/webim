package com.xbjs.webim.controller;

import com.google.gson.Gson;
import com.xbjs.webim.common.WebSocketConfig;
import com.xbjs.webim.pojo.ChatlogResult;
import com.xbjs.webim.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/10
 * @description:
 */
@RestController
@Import(value = {WebSocketConfig.class})
public class OtherController {
    @Autowired
    private OtherService otherService;

    @PostMapping("/uploadfile")
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile multipartFile) {
        try {
            SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
            requestFactory.setBufferRequestBody(false);
            RestTemplate rest = new RestTemplate(requestFactory);
            otherService.uploadFile(multipartFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "{'state':true}";
    }

    @GetMapping("/getChatLog")
    @ResponseBody
    public List<ChatlogResult> getChatLog(@PathParam("id") Long id, @PathParam("type") String type, HttpServletRequest request) {
        return otherService.getChatLog(id,type,(Long) request.getSession().getAttribute("userId"));
    }

}

