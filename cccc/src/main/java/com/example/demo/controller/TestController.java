package com.example.demo.controller;

import com.example.demo.model.JsonResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JiaLe on 2021/6/13 9:40
 */
//只在方法上添加RequestMapping注解
//@Controller
//public class TestController {
//    @RequestMapping("/test")
//    public String test() {
//        return "redirect:/home.html";
//    }
//}


@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/1")
    public String test1() {
        //转发：只有一次请求，url不变，服务端把资源作为响应体直接返回
        return "forward:/home.html";
    }

    @RequestMapping(value = "/2",method = RequestMethod.GET)
    public String test2() {
        //重定向：两次请求 url会变，3xx + Location.浏览器自动跳转
        return "redirect:/home.html";
    }

    @RequestMapping("/3")
    @ResponseBody
    public String test3() {
        //text/html  text/plain类型
        return "<h1>好了，已经知道了</h1>";
    }

    @RequestMapping("/4")
    @ResponseBody
    public Object test4() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zs");
        map.put(2,"ls");
        map.put(3,"ww");
        return map;
    }
    @RequestMapping("/4_1")
    @ResponseBody
    public Object test4_1() {
        Map<String,Object> map = new HashMap<>();
        map.put("succece",false);
        map.put("code","LOG001");
        map.put("message","用户不存在");
        map.put("data",null);
        return map;
    }

    @RequestMapping("/4_2")
    @ResponseBody
    public Object test4_2() {
        JsonResponse resp = new JsonResponse();
        resp.setCode("LOG001");
        resp.setMessage("用户不存在");
        return resp;
    }

    @RequestMapping("/5")
    @ResponseBody
    public String test5() {
        return null;
    }

    @RequestMapping("/6")
    @ResponseBody
    public Object test6() {
        return null;
    }

}
