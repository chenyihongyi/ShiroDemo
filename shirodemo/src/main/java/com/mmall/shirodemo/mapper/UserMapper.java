package com.mmall.shirodemo.mapper;

import com.mmall.shirodemo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByUserName(@Param("username") String username);
}
