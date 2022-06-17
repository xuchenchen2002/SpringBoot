package com.xcy.mapper;

import com.xcy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-21
 * 定义 User 的Dao接口
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();
}
