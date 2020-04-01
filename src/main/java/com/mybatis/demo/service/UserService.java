package com.mybatis.demo.service;

import com.mybatis.demo.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
