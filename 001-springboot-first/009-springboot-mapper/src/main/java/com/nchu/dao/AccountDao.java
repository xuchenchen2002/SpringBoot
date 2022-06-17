package com.nchu.dao;

import com.nchu.domain.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-08
 */

/**
 * @Mapper注解： 可以让spring扫描是知道这个是dao的接口，那么就会创建实体代理对象类，完成对应方法的编写
 *              结合对应的.xml文件完成方法逻辑的编写
 */

@Mapper
public interface AccountDao {

    public Account queryAccountById(Integer id);
}
