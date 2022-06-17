package com.nchu.service.impl;

import com.nchu.domain.User;
import com.nchu.mapper.UserMapper;
import com.nchu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-16
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /* 自动注入，由自己的注入规则 */
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
