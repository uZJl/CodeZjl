package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by JiaLe on 2021/6/29 15:05
 */
@RequestMapping("/user")
@Controller
@Slf4j
public class UserController {

    // 创建一个当前日志类对象
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/index")
    @ResponseBody
    public String getIndex() {
        log.error("我的日志信息，级别：error");
        log.trace("我的日志信息，级别：trace");
        log.debug("我的日志信息，级别：debug");
        log.info("我的日志信息，级别：info");
        log.warn("我的日志信息，级别：warn");

        return "你好,SpringBoot";
    }
}
