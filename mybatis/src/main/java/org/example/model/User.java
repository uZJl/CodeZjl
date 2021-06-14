package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * Created by JiaLe on 2021/6/14 19:49
 */
@Getter
@Setter
@ToString
public class User {

    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Boolean sex;
    private Date birthday;
    private String head;
    private Date createTime;
    private List<Article> articles;
}

