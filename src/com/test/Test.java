package com.test;

import com.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : liuxulong
 * date : 14:51 2019/4/15
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //setter方法注入
        User user1 = classPathXmlApplicationContext.getBean("user1", User.class);
        System.out.println(user1);
        //构造方法注入
        //类型注入
        User user2 = classPathXmlApplicationContext.getBean("user2", User.class);
        System.out.println(user2);
        //索引注入
        User user3 = classPathXmlApplicationContext.getBean("user3", User.class);
        System.out.println(user3);
        //联合注入
        User user4 = classPathXmlApplicationContext.getBean("user4", User.class);
        System.out.println(user4);

        //非静态注入
        User user5 = classPathXmlApplicationContext.getBean("user5", User.class);
        System.out.println(user5);
        //静态注入
        User user6 = classPathXmlApplicationContext.getBean("user6", User.class);
        System.out.println(user6);
    }
}
