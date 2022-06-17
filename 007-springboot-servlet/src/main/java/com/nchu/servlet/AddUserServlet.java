package com.nchu.servlet;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-06
 * 自定义Servlet类，就像回到了最初学习javaWeb的感觉，什么servlet请求都需要自己创建servlet类来实现HttpServlet
 * 这个只是在需要的时候使用，学一学如何在高级框架中使用最基本的操作（底层的实现）
 */
//@RequestMapping("/addUser") // 这样子不知道有没有作用，请求映射地址
// 加入这个RequestMapping注解应该是没有作用的，因为我没有去扫描当前类，不能解析对应的注解
// 那么如何设置当前servlet的请求地址，就只是按照对应的规则来，在配置类中ServletRegistrationBean注入器来实现
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 当前请求执行的方法，执行具体的逻辑操作
        System.out.println("正在执行AddUserServlet中的doPost方法：进行添加user的操作");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("正在执行AddUserServlet中的doPost方法：进行添加user的操作");
        writer.flush();
        writer.close();
    }
}
