package com.shop.service;

import com.shop.bean.User;
import com.shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddServlet",urlPatterns = "/addservlet.do")
public class AddServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setStatus(302);
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          String email = request.getParameter("email");

        UserDaoImpl userDao = new UserDaoImpl();
        userDao.addDate(username,password,email);
        response.setHeader("location","/shop/pages/user/regist_success.html");
//        request.getRequestDispatcher("/pages/user/regist_success.html").forward(request,response);


    }
}
