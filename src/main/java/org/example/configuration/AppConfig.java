package org.example.configuration;

import jakarta.inject.Named;
import org.example.Dao;
import org.example.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "org.example")
@Import(AppConfig1.class)
@ImportResource("classpath:applicationContext.xml")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Autowired
    public AppConfig1 appConfig1;

    @Bean(name = "UserService1", initMethod = "init")
    public UserService userService() {
        UserService userService = new UserService(appConfig1.dao());
        userService.setNum(1);
        return userService;
    }

    @Bean
    public DataSource dataSource(){
        String url = "jdbc:mysql://localhost:3306/test";

        return new DriverManagerDataSource(url, "root", "root");
    }
}
