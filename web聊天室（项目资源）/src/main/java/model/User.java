package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by JiaLe on 2021/5/16 11:51
 */

//数据库使用，前后端ajax ，session（Serializable）保存时基于对象和二进制数据装换（这里要实现串行化）
@Getter
@Setter
@ToString
public class User extends Response implements Serializable{
    private static final Long serialVersionUID = 1l;

    private Integer userId;

    private String name;

    private String password;

    private String NickName;

    private String iconPath;

    private String signature;

    private java.util.Date lastLogout;

}
