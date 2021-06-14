package com.example.demo.config;
import com.example.demo.exception.AppException;
import com.example.demo.model.JsonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by JiaLe on 2021/6/13 23:01
 */
//在SpringBoot中使用，会扫描启动类所在包下所有@Controller类

/**
 * @ControllerAdvice 方法上可以使用@ExceptionHandler处理异常
 * @RestControllerAdvice 有@ControllerAdvice和@ResponseBody组成
 */
@ControllerAdvice
@Slf4j//使用lombok日志注解，之后使用log属性完成打印日志工作
public class ExceptionAdvice {
    //如果客户端请求，执行控制器方法抛Exception异常，会执行本方法
    @ExceptionHandler(AppException.class)
    //方法返回值作为响应体
    @ResponseBody
    public Object handle1(AppException e){//方法参数即为捕获到的异常
        //构造响应数据
        JsonResponse json = new JsonResponse();
        //自定义异常报错错误码和错误信息
        json.setCode(e.getCode());
        json.setMessage(e.getMessage());

        return json;
    }
    //非自定义异常(英文的错误信息，堆栈信息，不能够给用户看)：
    // 指定一个错误码，错误信息（未知错误，请联系管理员）
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handle2(Exception e){//方法参数即为捕获到的异常
        //构造响应数据
        JsonResponse json = new JsonResponse();
        //自定义异常报错错误码和错误信息
        json.setCode("ERR000");
        json.setMessage("请联系管理员");
//        log.debug(transfer(e));
        log.debug("自定义异常",e);
        return json;
    }

    public String transfer(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw,true);
        e.printStackTrace(pw);
        return sw.toString();
    }
}
