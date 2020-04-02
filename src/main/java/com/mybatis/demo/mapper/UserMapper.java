package com.mybatis.demo.mapper;

import com.mybatis.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    List<User> findAll();
}
