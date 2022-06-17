package com.nchu.config;

import com.nchu.servlet.AddUserServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-06
 * 注册Servlet的实现，就是一个配置类，用于配置相应的配置信息
 */
@Configuration // 加入了这个注解才能让这个类成为配置类，用于配置信息，加入到容器当中
public class WebApplicationConfig {
    /**
     * 执行将自定义的Servlet注入到spring容器当中
     * @return 返回对应的注册信息，这个是spring容器自定义的注入信息，spring会自动调用这个兑现中的信息，进行执行操作
     */
    @Bean // 只有加入这个注解，当前的ServletRegistrationBean对象才会注入到spring容器当中
    public ServletRegistrationBean<HttpServlet> servletRegistrationBean(){
        // 1、创建对应的ServletRegistrationBean对象。结束返回加入spring容器
        //public ServletRegistrationBean(T servlet, String... urlMappings)
        // 第一个参数：对应的servlet，T是泛型  第二个参数：对应的请求路径地址
        ServletRegistrationBean<HttpServlet> bean = new ServletRegistrationBean(
                new AddUserServlet(),
                "/addUserServlet","/userLoginServlet"
                // 这里就说明了当前请求addUserServlet 和 userLoginServlet的话就会执行对应servlet的逻辑操作
        );
        // 2、返回bean对象，注入到spring容器当中
        return bean;
    }
}
