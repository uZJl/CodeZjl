import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by JiaLe on 2021/3/30 20:20
 */
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码和返回的类型
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        //获得前端传递的参数
        String num1 = request.getParameter("number1");
        String num2 = request.getParameter("number2");
        //业务逻辑处理
        int total = Integer.parseInt(num1) + Integer.parseInt(num2);
        //返回结果给前端
        PrintWriter writer = response.getWriter();
        writer.println(String.format("<h1>计算结果为：%d</h1>",total));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
