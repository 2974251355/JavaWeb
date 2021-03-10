package com.shop.dao.impl;

import com.shop.bean.User;
import com.shop.dao.UserDao;
import impl.BaseDao;
import org.omg.CORBA.Object;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {



    public User queryUserByUsername(String username) {

        String sql = "SELECT `id`, `username`, `password`, `email` FROM shoppassword WHERE `username` = ?";

        return super.queryForOne(User.class,sql,username);
    }


    public int addDate(String username,String password,String email) {
        String sql = "INSERT INTO shoppassword  (`username`,`password`,`email`)VALUES(?,?,?)";
        return super.update(sql,username,password,email);
    }

//    @Override
//    public <T> List<T> queryForList(String username,String password) {
//
//        String sql1 = "SELECT `id`, `username`, `password`, `email` FROM shoppassword WHERE `username` = ?";
//
////        return super.queryForList(User.class,sql1,username,password);
//
//    }

}
