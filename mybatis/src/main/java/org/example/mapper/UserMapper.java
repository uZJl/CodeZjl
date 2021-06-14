package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by JiaLe on 2021/6/14 19:48
 */

@Mapper
@Component
public interface UserMapper {

    User selectById(Integer id);
}
