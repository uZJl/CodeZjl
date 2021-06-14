package com.example.demo.config;

import com.example.demo.model.JsonResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created by JiaLe on 2021/6/13 23:48
 */
@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    /**
     * 执行controller的请求映射方法，如果有响应体内容，可以写入http协议响应体
     * @param body 请求映射防范返回值
     * @param request SpringMVC 封装的响应类
     * @param response 返回的响应体内容：一般的做法：请求映射返回Object，可以改为其他对象
     *                                                 返回String,使用json序列化
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //如果请求映射方法返回统一响应，就不需要再次包裹
        if (body instanceof JsonResponse)
            return body;
        //包裹为统一的响应格式
        JsonResponse json = new JsonResponse();
        json.setSuccess(true);
        json.setData(body);
        //如果是String 需要序列化
        if (body instanceof String) {
            try {
                return objectMapper.writeValueAsString(json);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("json序列化失败"+json);
            }
        }
        return json;
    }
}
