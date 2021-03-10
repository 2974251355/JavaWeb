package com.shop.dao;

import com.shop.bean.User;
import org.omg.CORBA.Object;

import java.util.List;

public interface UserDao {


    public User queryUserByUsername(String username);

    public int addDate(String username,String password,String email);

//    public <T>List<T> queryForList(String username,String password);
}
