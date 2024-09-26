package org.example.app;

import org.apache.commons.dbcp.BasicDataSource;
import org.example.AdvancedUser;
import org.example.Dao;
import org.example.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user",User.class);

        Dao dao = context.getBean("dao2",Dao.class);

//        CustomClass customClass = context.getBean("customClass",CustomClass.class);
//        CustomClass customClass2 = context.getBean("customClass",CustomClass.class);
//
//        if(customClass != customClass2){
//            System.out.println("custom class is a prototype");
//        }
//        else {
//            System.out.println("custom class is a singleton");
//        }

        Arrays.stream(context.getBeanDefinitionNames()).toList().forEach(System.out::println);

    }
}