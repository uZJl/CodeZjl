package com.example.demo.config.interceptor;

import com.example.demo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by JiaLe on 2021/6/13 15:05
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);

        if (session != null) {
            User user = (User)session.getAttribute("user");
            if (user != null) {
                return true;
            }
        } else {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return false;
        }
    }


}
