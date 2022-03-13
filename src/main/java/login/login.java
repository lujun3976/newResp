package login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Auther: reed
 * @Date: 2022/3/9 - 03 - 09 - 16:43
 * @Description: login
 * @version: 1.0
 */
public class login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("login !");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String mess = null;
        if (name.equals("xm") && pwd.equals("123")){
            mess = "success";
        }
        else {
            mess = "fail";
        }
        resp.getWriter().write(mess);
    }
}
