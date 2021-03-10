package com.shop.service;

import com.shop.bean.User;
import com.shop.dao.impl.UserDaoImpl;
import jdk.nashorn.internal.ir.WhileNode;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/loginservlet.do")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(302);
          String username = request.getParameter("username");
          String password = request.getParameter("password");

        UserDaoImpl userDao = new UserDaoImpl();


        User user = userDao.queryUserByUsername(username);
        System.out.println(user);
         if (user!=null){
             if (user.getPassword().equals(password)){

                 response.setHeader("location","/shop/pages/user/login_success.html");
             }else {
                 response.setHeader("location","/shop/pages/user/regist.html");
             }
         }else {
             response.setHeader("location","/shop/pages/user/regist.html");
         }

    }
}
