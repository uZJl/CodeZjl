package dao;

import exception.AppException;
import model.Channel;
import util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiaLe on 2021/5/17 17:20
 */
public class ChannelDao {

    public static List<Channel> query() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        //定义返回数据
        List<Channel> list = new ArrayList<>();
        try {
            connection = Util.getConnection();
            String sql = "select * from channel";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Channel channel = new Channel();

                channel.setChannelId(resultSet.getInt("channelId"));
                channel.setChannelName(resultSet.getString("channelName"));
                list.add(channel);
            }
            return  list;
        }catch (Exception e) {
            throw new AppException("查询频道出错",e);
        }finally {
            Util.close(connection,preparedStatement,resultSet);

        }
    }
}
