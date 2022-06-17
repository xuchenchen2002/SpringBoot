package com.nchu.mapper;

import com.nchu.domain.User;

import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-16
 */
public interface AccountMapper {

    List<User> findAll();
}
