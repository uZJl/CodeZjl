package services;

import dao.UserInfoDao;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Created by JiaLe on 2021/4/4 10:44
 */
public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        int succ = 0;
        String msg = "";
        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //todo:非空校验

        //业务逻辑处理：数据库操作
        UserInfoDao userInfoDao = new UserInfoDao();
        try {
            succ = userInfoDao.add(username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //返回结果
        HashMap<String,Object> result = new HashMap<>();
        result.put("succ",succ);
        result.put("msg",msg);
        ResultJSONUtils.write(response,result);

//        PrintWriter writer = response.getWriter();
//        writer.println(String.format("{\"succ\":%d,\"msg\":\"%s\"}",
//                succ, msg));

    }
}
