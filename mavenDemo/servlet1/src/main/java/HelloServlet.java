import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by JiaLe on 2021/3/30 19:02
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码防止乱码
        resp.setCharacterEncoding("utf-8");
        //设置数据类型
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1 style='color : green'>。。。。。。</h1>");
    }
}
