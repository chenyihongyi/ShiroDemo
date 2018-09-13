package com.mmall.shirodemo.service;

import com.mmall.shirodemo.mapper.UserMapper;
import com.mmall.shirodemo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }
}
