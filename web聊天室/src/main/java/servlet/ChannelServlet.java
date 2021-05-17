package servlet;

import dao.ChannelDao;
import exception.AppException;
import model.Channel;
import model.Response;
import util.Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by JiaLe on 2021/5/16 16:22
 */
@WebServlet("/channel")
public class ChannelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        Response response = new Response();
        try{
            //查询所有列表返回
            List<Channel> list = ChannelDao.query();
            response.setOk(true);
            response.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
            response.setOk(false);
            if(e instanceof AppException) {
                response.setReason(e.getMessage());
            } else {
                response.setReason("未知的错误");
            }
        }
        resp.getWriter().println(Util.serialize(response));
    }
}
