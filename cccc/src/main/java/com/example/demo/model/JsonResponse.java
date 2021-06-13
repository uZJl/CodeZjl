package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by JiaLe on 2021/6/13 10:38
 */
@Setter
@Getter
@ToString
public class JsonResponse {
    private boolean success;
    private String code;
    private String message;
    private Object data;
}
