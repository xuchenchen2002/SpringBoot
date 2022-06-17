package com.nchu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-06
 */

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 拦截器拦截到请求，请求处理前前的处理
     * @param request servlet请求的request
     * @param response servlet响应的response
     * @param handler 被拦截的对象
     * @return boolean 是否要进行预先处理
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        // 这里就是执行拦截到对应controller中的请求的处理
        System.out.println("拦截器LoginInterceptor拦截到了请求，并执行了相关操作...");
        System.out.println("handler = "+handler);
        return true;
    }
}
