package com.xbjs.webim.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xbjs.webim.pojo.ImUser;
import com.xbjs.webim.pojo.LayimResult;
import com.xbjs.webim.pojo.MineResult;
import com.xbjs.webim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/8/2
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private Gson gson;

    @PostMapping("/login")
    public ModelAndView getUserInfo(ImUser imUser, ModelAndView mav, HttpServletResponse response, HttpServletRequest request) {
        try {
            if (!userService.userLogin(imUser)) {
                mav.setViewName("/login");
                mav.addObject("flag", "fail");
                return mav;
            }
            mav.addObject("userId", imUser.getId());
            request.getSession().setAttribute("userId", imUser.getId());
            response.sendRedirect(request.getContextPath() + "/");
            mav.addObject("flag", "fail");
            userService.updateUserStatus(imUser.getId(), "online");
        } catch (Exception e) {
            mav.setViewName("/login");
            mav.addObject("flag", "fail");
            request.getSession().setAttribute("userId", null);
            return mav;
        }
        return null;
    }

    @GetMapping("mine")
    @ResponseBody
    public String myMine(HttpServletRequest request) {
        userService.updateUserStatus((Long) request.getSession().getAttribute("userId"), "online");
        return gson.toJson(userService.getUserInfo((Long) request.getSession().getAttribute("userId")));
    }

    @GetMapping("group_members")
    @ResponseBody
    public String groupMembers(Long id) {
        return gson.toJson(userService.getMembersInfo(id));
    }

    @GetMapping("updateStatus")
    @ResponseBody
    public int updateStatus(HttpServletRequest request, String status) {
        return userService.updateUserStatus((Long) request.getSession().getAttribute("userId"), status);
    }

    @GetMapping("updateSign")
    @ResponseBody
    public int updateSign(HttpServletRequest request, String sign) {
        return userService.updateUserSign((Long) request.getSession().getAttribute("userId"), sign);
    }
}