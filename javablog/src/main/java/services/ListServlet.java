package services;

import dao.ArticleInfoDao;
import models.ArticleInfo;
import models.vo.ArticleInfoVO;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by JiaLe on 2021/4/8 19:05
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int succ = -1;
        String msg = "";
        List<ArticleInfoVO> list = null;
        //1.获取前端参数
        int page = Integer.parseInt(req.getParameter("page"));
        int psize = Integer.parseInt(req.getParameter("psize"));
        //2.执行相应的业务逻辑，去数据库执行业务逻辑
        ArticleInfoDao articleInfoDao = new ArticleInfoDao();
        try {
            list = articleInfoDao.getListByPage(page,psize);
            succ = 1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //3.返回结果给前端
        HashMap<String,Object> map = new HashMap<>();
        map.put("succ",succ);
        map.put("msg",msg);
        map.put("list",list);
        ResultJSONUtils.write(resp,map);
    }
}
