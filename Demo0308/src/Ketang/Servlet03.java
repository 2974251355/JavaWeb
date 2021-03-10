package Ketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet03",urlPatterns = "/servlet03.do")
public class Servlet03 extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        System.out.println(username);
        System.out.println("在Servlet03中查看");

        request.setAttribute("Key1","柜台1");
        request.getRequestDispatcher("/servlet04.do").forward(request,response);

    }
}
