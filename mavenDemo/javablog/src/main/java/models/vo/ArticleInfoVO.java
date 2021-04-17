package models.vo;

import models.ArticleInfo;

/**
 * Created by JiaLe on 2021/4/8 19:11
 */
public class ArticleInfoVO extends ArticleInfo {
    private String username;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
