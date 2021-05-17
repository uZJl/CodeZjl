package servlet;

import dao.UserDao;
import exception.AppException;
import model.User;
import util.Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by JiaLe on 2021/5/16 14:41
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    //检测登录状态接口,页面初始化时执行
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        //返回的数据，用户信息
        User u = new User();
        //
        HttpSession session = req.getSession(false);

        if(session != null) {
            User get = (User) session.getAttribute("user");
            if (get != null) {
                u = get;
                u.setOk(true);
                resp.getWriter().println(Util.serialize(u));
                return;
            }
        }

        u.setOk(false);
        u.setReason("用户未登录");
        //3.返回响应数据，从响应对象获取输出流，打印输出到对应的body
        resp.getWriter().println(Util.serialize(u));
    }

    //登录接口
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        //
        User u = new User();

        try{
            //1.解析请求数据：根据接口文档，需要使用反序列化操作
            User input = Util.deserialize(req.getInputStream(),User.class);
            //2.业务处理：数据库验证账号密码 如果验证通过 创建session 保存用户信息
            //根据账号查询用户
            User query = UserDao.queryByName(input.getName());
            if(query == null) {
                throw new AppException("用户不存在");
            }
            if(!query.getPassword().equals(input.getPassword())) {
                throw new AppException("账号或密码错误");
            }
            //账号密码验证成功 创建session 保存用户信息
            HttpSession session = req.getSession();
            session.setAttribute("user",query);
            u = query;
            //构造操作成功的正常返回数据：ok:true 业务字段
            u.setOk(true);
        }catch (Exception e) {
            //
            e.printStackTrace();
            u.setOk(false);
            if(e instanceof AppException) {
                u.setReason(e.getMessage());
            } else {
                u.setReason("未知的错误");
            }
        }
        //3.返回响应数据，从响应对象获取输出流，打印输出到对应的body
        resp.getWriter().println(Util.serialize(u));
    }
}
