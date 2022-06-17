package com.nchu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-05
 * 第一次写springboot:
 *  从这里可以看的出来，在springboot项目中写controller层省去了很多的配置步骤
 *  我们只需要完成的就是编写controller的核心方法就可以了，配置都完成了
 *  当然啦，这里只是最简单的web形式的应用，在复杂的话还是有一些东西需要自己手动取配置的
 */

@Controller
@RequestMapping("/first")
public class FirstSpringBoot {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){
        System.out.println("controller表现层helloSpringBoot执行了...");
        return "controller表现层helloSpringBoot执行了";
    }


}
