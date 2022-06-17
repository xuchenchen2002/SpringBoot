package com.nchu.dao;

import com.nchu.domain.User;

import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-16
 */
public interface RoleMapper {
    List<User> findAll();
}
