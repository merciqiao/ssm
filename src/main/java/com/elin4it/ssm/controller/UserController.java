package com.elin4it.ssm.controller;

import com.elin4it.ssm.pojo.User;
import com.elin4it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        List<User> users = userService.findUser();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("findUser");

        return modelAndView;
    }
}
