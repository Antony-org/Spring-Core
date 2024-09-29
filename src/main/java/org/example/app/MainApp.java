package org.example.app;


import org.example.Dao;
import org.example.UserService;
import org.example.configuration.AppConfig;
import org.example.custom.MyPropertySource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

import javax.sql.DataSource;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getEnvironment().setActiveProfiles("production");


        UserService userService = context.getBean("UserService1", UserService.class);

        System.out.println("userServiceNUM = " + userService.getNum());


        MutablePropertySources sources = context.getEnvironment().getPropertySources();

        sources.addFirst (new MyPropertySource("Mayresource"));

        DataSource dataSource = context.getBean(DataSource.class);

        Environment env = context.getEnvironment();
        String propertyValue = env.getProperty("userId");
        System.out.println("userId is " + propertyValue);
        System.out.println("userUrl is " + dataSource);



    }
}