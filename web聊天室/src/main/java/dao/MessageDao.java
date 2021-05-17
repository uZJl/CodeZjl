package dao;

import exception.AppException;
import model.Message;
import util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by JiaLe on 2021/5/17 19:09
 */
public class MessageDao {
    public static int insert(Message msg) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Util.getConnection();
            String sql = "insert into message values (null,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,msg.getUserId());
            preparedStatement.setInt(2,msg.getChannelId());
            preparedStatement.setString(3,msg.getContent());
            preparedStatement.setTimestamp(4,new Timestamp(System.currentTimeMillis()));
            return preparedStatement.executeUpdate();
        } catch (Exception e){
            throw new AppException("消息保存出错",e);
        } finally {
            Util.close(connection,preparedStatement);
        }
    }

    public static List<Message>
}

