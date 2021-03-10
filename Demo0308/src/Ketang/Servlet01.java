package Ketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="Servlet01" , urlPatterns = "/servlet01.do")
public class Servlet01 extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求的资源路径URI
        System.out.println("URI="+request.getRequestURI());
        //获取请求的统一资源定位URL
        System.out.println("URL="+request.getRequestURL());
        //获取客户端的ip地址
        System.out.println("客户端IP地址="+request.getRemoteHost());

        System.out.println("客户端getRemoteAddr="+request.getRemoteAddr());
        //获取请求头
        System.out.println("请求头="+request.getHeader("Cookie"));
        //获取请求方式GET或者POST
        System.out.println("请求方式:"+request.getMethod());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request, response);
    }
}
