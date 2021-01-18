package com.domain;
public class User {
    private String name;
    private String password;
    //有参以及无参构造方法
    public User(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }
    public User() {
        super();
    }
    //set/get方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
