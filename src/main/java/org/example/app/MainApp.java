package org.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//
//        helloWorld.printMessage();



//        Service1Impl service1 = (Service1Impl) context.getBean("service1");
//        Service1Impl service2 = (Service1Impl) context.getBean("service2");
//        Service1Impl service3 = (Service1Impl) context.getBean("service3");
//
//        // Optionally, verify the values if needed
//        System.out.println("Service2 value: " + service2.getValue());
//        System.out.println("Service3 name: " + service3.getName());
//
//
//        Service1Impl myCar = (Service1Impl) context.getBean("myCar");
//        System.out.println(myCar.getName()); //should be Toyota


    }
}