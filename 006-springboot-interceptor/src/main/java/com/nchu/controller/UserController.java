package com.nchu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-06
 * user请求操作的表现层
 */

/**
 * 按照顺序执行就有相应的结果如下：
 * 1、执行了UserController中的userLogin登录操作
 * 2.1、拦截器LoginInterceptor拦截到了请求，并执行了相关操作...
 * 2.2、执行了UserController中的addUser登录操作
 *
 * 从上面可以看出来，login没有被拦截器拦截下来，然而add被拦截下来了，就说明当前的自定义登录拦截器是有作用的
 * 执行add操作之前当前add服务请求被拦截下来了，先执行自定义拦截器相关的方法，然后在执行对应add操作请求的方法（add有可能不会执行）
 * 这里的具体执行逻辑由相关代码来决定，反正是：拦截器执行 --> 拦截下来执行preHandle等方法 --> 请求服务执行
 */
@Controller
@RequestMapping("/user")
public class UserController {


    /**
     * 输出结果：执行了UserController中的userLogin登录操作
     * 说明当前这个 /user/login 的请求没有被拦截
     */
    @RequestMapping("/login")
    @ResponseBody
    public String userLogin(){
        System.out.println("执行了UserController中的userLogin登录操作");
        return "执行了UserController中的userLogin登录操作";
    }

    /**
     * 输出结果：
     *  拦截器LoginInterceptor拦截到了请求，并执行了相关操作...
     *  handler = com.nchu.controller.UserController#addUser()
     *  执行了UserController中的addUser登录操作
     * 分析：
     *      1、可以看的出来，当前 /user/add 请求被拦截下来了，执行了拦截处理方法
     *      2、其中的 handler 对象 就是知道当前请求的方法
     *      3、在拦截方法中 return true; 放行了当前请求，那么就回来执行对应的handler方法了
     */
    @RequestMapping("/add")
    @ResponseBody
    public String addUser(){
        System.out.println("执行了UserController中的addUser登录操作");
        return "执行了UserController中的addUser登录操作";
    }

}
