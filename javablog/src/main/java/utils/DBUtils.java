package utils;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by JiaLe on 2021/4/4 11:02
 */
public class DBUtils {

    private static MysqlDataSource dataSource = null;

    /**
     * 得到Connection的通用方法
     * @return
     */
    public static Connection getConnection() throws SQLException {
        if(dataSource == null) {
            dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://127.0.0.1:3306/java18blog?characterEncoding=utf-8");
            dataSource.setUser("root");
            dataSource.setPassword("12345678");
        }
        return dataSource.getConnection();


    }
    public static void close(Connection connection,
                             PreparedStatement statement,
                             ResultSet resultSet) throws SQLException {
        if(resultSet != null) resultSet.close();
        if(statement != null) statement.close();
        if(connection != null) connection.close();

    }

}
