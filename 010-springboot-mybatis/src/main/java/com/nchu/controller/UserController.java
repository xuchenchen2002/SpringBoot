package com.nchu.controller;

import com.nchu.domain.User;
import com.nchu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-16
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() {
        List<User> users = userService.findAll();
        for(User user : users) {
            System.out.println(user);
        }
        return users.toString();
    }


}
