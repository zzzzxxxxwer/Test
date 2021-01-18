package com.Dao;
import com.domain.User;
public interface UserDao {
    //实现注册的方法
    public abstract void regist(User user);
    //实现登录的方法
    public abstract boolean isLogin(String name,String password);
}