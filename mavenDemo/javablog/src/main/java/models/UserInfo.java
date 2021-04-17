package models;

import java.sql.Date;
    /*create table userinfo(
            id int primary key auto_increment,
            createtime datetime default now(),
            updatetime datetime default now(),
            username varchar(50) not null,
            password varchar(32) not null,
            state int default 1
            );*/

/**
 * Created by JiaLe on 2021/4/4 11:51
 */
public class UserInfo {
    private int id;
    private Date createtime;
    private Date updatetime;
    private  String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private int state;
}
