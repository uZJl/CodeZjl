package dao;

import exception.AppException;
import model.User;
import util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 * Created by JiaLe on 2021/5/16 15:20
 */
public class UserDao {

    public static User queryByName(String name) throws AppException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //定义返回数据
        User u = new User();
        try{
            //1.建立数据库连接
            c = Util.getConnection();
            //2.通过Connection + sql创建操作命令对象Statement
            String sql = "select * from user while name = ?";
            ps = c.prepareStatement(sql);
            //3.执行sql:执行前替换占位符
            ps.setString(1,name);
            rs = ps.executeQuery();
            //4.如果是查询操作，处理结果集
            while (rs.next()) {
                u = new User();

                u.setUserId(rs.getInt("userId"));
                u.setName(name);
                u.setPassword(rs.getString("password"));
                u.setNickName(rs.getString("nickName"));
                u.setIconPath(rs.getString("iconPath"));
                u.setSignature(rs.getString("signature"));
                java.sql.Timestamp lastLogout = rs.getTimestamp("lastLogout");
                u.setLastLogout(new Date(lastLogout.getTime()));
            }
            return u;
        } catch (Exception e){
            throw new AppException("查询用户账号异常",e);
        } finally {
            //5.释放异常
            Util.close(c,ps,rs);
        }
    }
}
