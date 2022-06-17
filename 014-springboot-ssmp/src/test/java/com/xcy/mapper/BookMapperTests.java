package com.xcy.mapper;

import com.xcy.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-18
 */

@SpringBootTest
public class BookMapperTests {

    /**
     * 测试 Dao 接口视是否实现了，我只要注入调用方法就行了
     * 采用自动注入的方式，一般都不会有错
     */
    @Resource
//    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testFindAll() {
        List<Book> books = bookMapper.selectList(null);
        System.out.println(books);
    }


    @Test
    void contextLoads() {
    }
}
