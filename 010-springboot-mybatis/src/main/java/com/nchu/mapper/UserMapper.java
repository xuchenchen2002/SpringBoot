package com.nchu.mapper;

import com.nchu.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-16
 * 这个是UserDao接口，定义方法进行与 数据库交互操作
 *
 * @Mapper： 告诉 Mybatis 当前接口是一个 Dao接口，需要创建此接口的动态代理对象
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

}
