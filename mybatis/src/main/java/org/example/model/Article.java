package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by JiaLe on 2021/6/14 19:45
 */
@Getter
@Setter
@ToString
public class Article {

    private Integer id;
    private String title;
    private String content;
    private Integer viewCount;
    private Integer userId;
    private Date createTime;
    private User user;
}
