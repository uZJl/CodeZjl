package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 自定义异常：保存错误码和错误信息
 * Created by JiaLe on 2021/6/13 23:15
 */
@Getter
@Setter
public class AppException extends RuntimeException{

    private String code;

    public AppException(String code, String message) {
        super(message);
        this.code = code;
    }

    public AppException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
