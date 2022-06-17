package com.xcy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xcy.domain.Book;
import com.xcy.mapper.BookMapper;
import com.xcy.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-18
 * 这里继承了 mybatis-plus 中官方写的 ServiceImpl< M, T> 内，里面就具体实现了对应
 * 业务层service: 常用的方法，那么我们就可以在 controller层 直接调用
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
