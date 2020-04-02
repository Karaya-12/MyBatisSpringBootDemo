package com.mybatis.demo.service.impl;

import com.mybatis.demo.domain.User;
import com.mybatis.demo.mapper.UserMapper;
import com.mybatis.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired  // Autowire Mapper Bean in Service Impl
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
