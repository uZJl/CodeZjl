package com.example.demo.controller;

import com.example.demo.model.JsonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by JiaLe on 2021/6/13 10:53
 */
@RestController
@RequestMapping("/rest")
public class TestRestController {
    @GetMapping("/1")
    public Object rest1() {
        JsonResponse resp = new JsonResponse();
        resp.setCode("LOG001");
        resp.setMessage("用户不存在");
        resp.setData(new Date());
        return resp;
    }
}
