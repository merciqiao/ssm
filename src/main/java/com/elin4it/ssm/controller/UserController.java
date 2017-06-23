package com.elin4it.ssm.controller;

import com.elin4it.ssm.pojo.User;
import com.elin4it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import  org.codehaus.jackson.*;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/findABC", method = RequestMethod.POST)
    @ResponseBody
    public String findABC(@RequestBody User user)
    {
        return  user.getId().toString();
    }











    @Autowired
    private UserService userService;
    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        List<User> users = userService.findUser();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("/WEB-INF/findUser.jsp");

        return modelAndView;
    }
}
