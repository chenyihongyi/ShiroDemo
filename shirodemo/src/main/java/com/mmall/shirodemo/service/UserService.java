package com.mmall.shirodemo.service;

import com.mmall.shirodemo.model.User;

public interface UserService {

    User findByUserName(String username);
}
