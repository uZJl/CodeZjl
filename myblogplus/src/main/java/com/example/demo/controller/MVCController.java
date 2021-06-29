package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by JiaLe on 2021/6/29 16:10
 */

@Controller
@RequestMapping("/mvc")
public class MVCController {

    @RequestMapping("/index")
    public String getIndex() {
        return "/index.html";
    }


    /*
    实现301永久重定向
     */
    @RequestMapping("/index3")
    public String getIndex3(HttpServletResponse response,
                            HttpServletRequest request) {
        response.setStatus(301);
        response.setHeader("Location", "/index.html");
        return null;
    }
}
