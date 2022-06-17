package com.nchu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 小晨Yu呀!
 * @time 2021-12-05
 * 使用了jsp的方法
 */
@Controller
public class JspController {

    @RequestMapping("/doJsp")
    public String doJsp(Model model){
        System.out.println("JspController中的doJsp开始执行了...");
        model.addAttribute("data", "JspController中的doJsp开始执行了");
        return "index";
        // 返回视图的名称
        // 这里需要使用自己手动去配置视图解析器
        // 这里的基本所有配置的信息都是在application.properties中进行配置
    }

}
