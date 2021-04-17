package services;

import dao.ArticleInfoDao;
import models.ArticleInfo;
import models.UserInfo;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by JiaLe on 2021/4/4 16:33
 */
public class MyArtListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ArticleInfo> list= null;
        String msg = "";
        int succ = -1;
        //从session获取参数
        HttpSession session = request.getSession(false);//若获取不成功不会再创建新的会话
        if(session == null) {
            msg = "非法请求，请先登录！";
        } else {
            //获取key(userinfo)对应的value(userInfo)
            UserInfo userInfo = (UserInfo) session.getAttribute("userinfo");//获取key(userinfo)对应的value(userInfo)
            int uid = userInfo.getId();
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            try {
                list = articleInfoDao.getListByUID(uid);
                succ = 1;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        HashMap<String,Object> result = new HashMap<>();
        result.put("succ",succ);
        result.put("msg",msg);
        result.put("list",list);
        ResultJSONUtils.write(response,result);


    }
}
