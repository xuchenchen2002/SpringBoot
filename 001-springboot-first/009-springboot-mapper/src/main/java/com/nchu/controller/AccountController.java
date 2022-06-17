package com.nchu.controller;

import com.nchu.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-08
 * 账户的表现层，用与编写用户类请求的逻辑方法
 *
 */

/* 将当前AccountController对象交给spring容器进行管理 */
@Controller("accountController")
/* 给当前Controller一个映射地址（请求访问地址） */
@RequestMapping("/account")
public class AccountController {

    /* 在当前accountController对象中注入 accountService对象 */
    @Resource
    private AccountService accountService;

    /* 给当前执行的方法queryAccountById一个映射地址（请求访问地址） */
    @RequestMapping("/queryAccountById")
    /* 返回值是 响应体内容 */
    @ResponseBody
    public String queryAccountById(Integer id){
        return "查询到的账户为="+accountService.queryAccountById(id).toString();
    }

}
