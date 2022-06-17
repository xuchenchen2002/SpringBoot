package com.xcy.aop;

import com.xcy.domain.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-21
 * User 的AOP 配置类
 */
// 将当前类注入到 容器中
@Component
// 将当前类 标记为是一个AOP 配置类
@Aspect
public class UserAopConfig {

    // 配置切入点：也就是那些方法需要被加强，切点表达式
    @Pointcut("execution(public * com.xcy.service.*Service.*())")
    public void demoPt() { }

    // 配置通知：也就是加强的方法，那些方法加强对应的方法。
    @Around("demoPt()")
    public List<User> demoAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行了demoAdvice 的 前 处理");
        List<User> users = (List<User>) pjp.proceed();
        System.out.println("执行了demoAdvice 的 后 处理");
        return  users;
    }

}
