package org.example.controller;

import lombok.Getter;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by JiaLe on 2021/6/8 21:23
 */

@Controller
@Getter
@Scope("prototype")
public class LoginController {

    //查询 第一种依赖注入的方式 属性注入
//    @Autowired
//    private LoginService loginService;

//    //第二种：通过Set方式注入
//    private LoginService loginService;
//    @Autowired
//    public void setLoginService(LoginService loginService) {
//        this.loginService = loginService;
//    }
    //第三种注入方式：构造函数注入
    private LoginService loginService;
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public void sayHi() {
        loginService.sayHi();
    }

    @Bean
    public User user1() {
        User user = new User();
        user.setName("悟空");
        user.setPassword("123");
        return user;
    }

    @Bean
    public User user2() {
        User user = new User();
        user.setName("八戒");
        user.setPassword("123");
        return user;
    }
}
