package com.tencent.ssm.controller;

import com.tencent.ssm.pojo.User;
import com.tencent.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author misaka
 * @create 2022-07-2914:17
 */
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/list")
    private String getUserList(ModelAndView model){
        List<User> res = service.getList();
        model.addObject("users",res);
        return "userTable";
    }
}
