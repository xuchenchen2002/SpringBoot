package com.xcy.controller;

import com.xcy.controller.utils.R;
import com.xcy.domain.Book;
import com.xcy.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-18
 * Book 图书的控制层
 * 接受前端的请求，并响应对应的数据给前端
 * @Controller 将当前 Controller 对象注入到 spring 容器中
 * @ResponseBody 标识当前 Controller 下面所有的方法 返回的数据结果都是 作为响应体 而不是 视图名称
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
// http://localhost:9090/books/list
// http://localhost:9090/books
@CrossOrigin
public class BookController {
    // ajax.get("http://localhost:9090/books/list").then(RES -> {})

    @Resource
    private BookService bookService;

    //  --------------以下这是使用了RestFull 的风格---------------------------------  //
    @GetMapping()
    public R list(){
        List<Book> books = bookService.list();
        if( books != null ) {
            // 当前查询结果ok
            return new R(true,200,books);

        }
        // 说明当前查询结果 不ok
        return new R(false,500,null);
    }

    /**
     * @param id 图书的 id
     * @return  一个封装好的 R 类型
     */
    @DeleteMapping("/{id}")
    public R deleteBookById(@PathVariable Integer id) {
        boolean flag = bookService.removeById(id);
        if(flag) {
            return new R(true,200,null);
        }
        return new R(false,500,null);
    }

    //  --------------以下这是使用了经典的方法, @RequestMapping----------------------  //

    @RequestMapping("/findAll")
    public List<Book> findAll() {
        List<Book> books = bookService.list();
        return books;
    }

    /**
     * @return 一个封装好的 R 类型
     */
    @RequestMapping("/findAllToR")
    public R findAllToR() {
        List<Book> books = bookService.list();
        if( books != null ) {
            // 当前查询结果ok
            return new R(true,200,books);
        }
        // 说明当前查询结果 不ok
        return new R(false,500,null);
    }

}
