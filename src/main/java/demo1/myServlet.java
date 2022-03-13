package demo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @Auther: reed
 * @Date: 2022/3/8 - 03 - 08 - 15:42
 * @Description: com.example.demo1
 * @version: 1.0
 */
public class myServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num = new Random().nextInt();
        String message = num%2==0?"good":"bad";
        String decoration = "<h1 style='color:red'>"+message+"</h1>";
        PrintWriter pw = resp.getWriter();
        pw.write(decoration);
    }
}
