package com.nchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 对于在springboot项目中执行自定义的servlet操作
 * 1、创建自定义servlet类，继承extends HttpServlet 实现对应的方法（感觉又回到了最初的开始）
 * 2、创建ServletRegistrationBean对象，将自定义Servlet加入到容器当中
 * 3、然后只需要自己发送对应的请求就可以了，后续的操作与执行spring容器都会自动进行调度执行逻辑操作
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
