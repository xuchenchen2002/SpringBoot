package com.xcy.service;

import com.xcy.domain.Book;
import com.xcy.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-18
 * 关于 BookService 业务层的测试类
 * 注意：这里写的测试方法，与调用 service的方法名称可能不同，是由于自己的习惯和官方定义的不同而已
 *  但是实际的作用效果，都是一样的
 */
@SpringBootTest
public class BookServiceTests {

    @Resource
    private BookServiceImpl bookService;

    @Test
    public void testFindAll() {
        List<Book> books = bookService.list();
        for(Book book : books)
            System.out.println(book);
    }
    @Test
    void contextLoads() {
    }
}
