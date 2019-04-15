package com.entity;

/**
 * @author : liuxulong
 * date : 15:01 2019/4/15
 */
public class UserFactory {
    public User createUser(){
        User user=new User();
        user.setId(5);
        user.setUsername("admin05");
        user.setPassword("admin005");
        return user;
    }
    public static User createStaticUser(){
        User user=new User();
        user.setId(6);
        user.setUsername("admin06");
        user.setPassword("admin006");
        return user;
    }
}
