package services;

import dao.UserInfoDao;
import models.UserInfo;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Created by JiaLe on 2021/4/4 15:01
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("application/json");
        int succ = -1; //1为登陆成功
        String msg = "";
        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username != null && !username.equals("")
                && password != null && !password.equals("")) {
            UserInfo userInfo = new UserInfo();
            UserInfoDao userInfoDao = new UserInfoDao();
            try {
                userInfo = userInfoDao.getUser(username,password);
                if(userInfo.getId() >= 1) {
                    succ = 1;
                    //登陆成功，建立一个新的会话
                    HttpSession session = request.getSession();
                    session.setAttribute("userinfo",userInfo);
                } else {
                    succ = 0;
                    msg = "用户名或密码输入错误！";
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "参数不完整！";
        }
        HashMap<String,Object> result = new HashMap<>();
        result.put("succ",succ);
        result.put("msg",msg);
        ResultJSONUtils.write(response,result);
    }
}
