package com.xcy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xcy.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-18
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

    /**
     * 在这里没有定义任何方法，也没有编写任何mapper.xml文件，用于实现 dao 对数据库的访问
     * 就是通过 Mybatis-plus 中这个BaseMapper<Book> 接口来自动实现的，自动创建了对应的实现类
     * 只要根据你传进来的 实体类 对象，就能创建出对应的 Dao 接口，以及常用的方法
     * 而且，会自动根据 你 配置的 dataSource 的信息编写出对应的 SQL 进行对数据库的操作
     */

}
