package com.nchu.config;

import com.nchu.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-06
 */

// 告诉容器这个是需要配置的，加入容器，容器会自动调用下面的addInterceptors的方法，进行添加拦截器的操作
@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    /**
     * 添加interceptors的操作，一般用于：添加自定义的拦截器到 spring容器中
     * @param registry 拦截器的注册器，也就是容器中的某一个变量
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 创建自定义的拦截器
        HandlerInterceptor interceptor = new LoginInterceptor();
        // 将当前自定义的拦截器加入容器当中 InterceptorRegistration：代表当前的拦截器注册对象，拦截当前的LoginInterceptor 拦截处理器
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(interceptor);
        // 然后绑定那些需要拦截的请求地址，RequestMapping ==> 对应的请求uri
        String[] addPathPatterns = {"/user/**"}; // 代表有关于user的所有请求都要拦截
        String[] excludePathPatterns = {"/user/login"}; // 代表user的login操作请求不用拦截
        interceptorRegistration.addPathPatterns(addPathPatterns);
        interceptorRegistration.excludePathPatterns(excludePathPatterns);
    }
}
