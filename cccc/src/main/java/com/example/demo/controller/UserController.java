package com.example.demo.controller;

import com.example.demo.model.JsonResponse;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JiaLe on 2021/6/13 15:00
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public Object login(User user, HttpServletRequest req) {
        JsonResponse json = new JsonResponse();
        //模拟用户登录时，用户名和密码校验
        if("abc".equals(user.getUsername()) && "123".equals(user.getPassword())){
            //登录成功，创建session
            //通过请求头Cookie：JSESSIONID=xxx,在服务端map中通过xxx查找session
            HttpSession session = req.getSession();
            //添加用户身份信息到session
            session.setAttribute("user", user);
            json.setSuccess(true);
        } else {
            json.setMessage("用户名或密码错误");
            json.setCode("USRLOG");
        }
        return json;
    }
}
