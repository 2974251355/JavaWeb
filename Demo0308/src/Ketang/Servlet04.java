package Ketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet04",urlPatterns = "/servlet04.do")
public class Servlet04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET");
        String username = request.getParameter("username");
        System.out.println(username);
        System.out.println("在Servlet04");
        System.out.println("柜台1是否有章："+request.getAttribute("key1"));
        System.out.println("servlet04");
    }
}
