package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Article;
import org.springframework.stereotype.Component;

/**
 * Created by JiaLe on 2021/6/14 19:44
 */

@Mapper
@Component
public interface ArticleMapper {

    Article select
}
