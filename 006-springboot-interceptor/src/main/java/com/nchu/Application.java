package com.nchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 关于拦截器interceptor的问题
 * 1、自定义拦截器LoginInterceptor
 * 2、将当前自定义拦截器告诉springboot，加入容器
 */

/** 这里就是主要配置类，有以下功能
 * 1、会自动扫描当前包下所有的类以及 子包下所有的类（当然这些类是加入注释要被扫描的才会被扫描）ComponentScan
 * 2、Application这个类就相当于一个主配置类（用于添加很多的子配置类）SpringBootConfiguration
 * 3、还有很多的作用...很复杂具体实现都于SpringBootApplication注解有关
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
