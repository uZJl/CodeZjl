package dao;

/**
 * 操作数据库
 * Created by JiaLe on 2021/4/4 11:00
 */

import models.UserInfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 操作userinfo表
 */
public class UserInfoDao {
    public int add(String username,String password) throws SQLException {
        int result = 0;
        Connection connection = DBUtils.getConnection();
        String sql = "insert into userinfo(username,password) values(?,?)";//(?,?)两个占位符
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //填充两个占位符
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        result = preparedStatement.executeUpdate();
        DBUtils.close(connection,preparedStatement,null);
        return result;
    }

    /**
     *
     */

    public UserInfo getUser(String username,String password) throws SQLException {
        UserInfo userInfo = new UserInfo();

        Connection connection = DBUtils.getConnection();
        String sql = "select * from userinfo where username=? and password=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,username);
        statement.setString(2,password);
        ResultSet resultSet = statement.executeQuery();//查询数据库，将结果放置到resultSet中
        while(resultSet.next()) {
            userInfo.setId(resultSet.getInt("id"));
            userInfo.setUsername(resultSet.getString("username"));
            userInfo.setPassword(resultSet.getString("password"));
        }
        DBUtils.close(connection,statement,null);

        return userInfo;
    }
}
