package org.example.app;

import org.example.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");

        System.out.println("Emails: " + user.getEmails());

        System.out.println("User name: " + user.getName());

        System.out.println("User address: " + user.getAddress().getStreet());

//        context.registerShutdownHook();

    }
}