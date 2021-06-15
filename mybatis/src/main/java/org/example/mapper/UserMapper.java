package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by JiaLe on 2021/6/14 19:48
 */

@Mapper
@Component
public interface UserMapper {

    User selectById(Integer id);

    void insert(User user);

    List<User> selectLike(String s, Object o, String desc);

    List<User> selectAll();

    void batchInsert(List<User> list);
}
