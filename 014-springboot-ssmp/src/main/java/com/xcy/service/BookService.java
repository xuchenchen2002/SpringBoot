package com.xcy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcy.domain.Book;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-18
 * Book 图书的业务层接口
 * 定义方法
 *
 * 这里使用了 mybatis-plus 官方给定的 接口，里面定义了很多的常用 service 的方法
 *  那么我们就不需要自定义一些比较常用的放了，们直接使用这个官方定义的来，直接调用
 *
 *  注意：如果官方给定的不够满足我们的业务要求，那么我们有三种做法来完成业务逻辑的实现
 *      1、自定义方法，在接口中自定义方法，和以前的做法是一样的，然后在接口实现类中实现，完成业务逻辑的编写
 *      2、覆盖IService<T> 中的方法
 *      3、重载IService<T> 中的方法
 */
public interface BookService extends IService<Book> {

}
