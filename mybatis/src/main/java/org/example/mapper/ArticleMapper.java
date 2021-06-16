package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Article;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by JiaLe on 2021/6/14 19:44
 */

@Mapper
@Component
public interface ArticleMapper {

    Article selectById(Integer id);

    List<Article> selectAll();

    int delectByUsername(String s);

    int updateById(Article article);
}
