package com.shop.test;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername(){
        System.out.println(userDao.queryUserByUsername("admin"));


        userDao.addDate("abc","123","123");
    }
    }

