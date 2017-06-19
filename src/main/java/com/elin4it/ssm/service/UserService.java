package com.elin4it.ssm.service;

import com.elin4it.ssm.mapper.UserMapper;
import com.elin4it.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findUser()
    {
         List<User> users=userMapper.selectByExample(null);
         return users;
    }
}
