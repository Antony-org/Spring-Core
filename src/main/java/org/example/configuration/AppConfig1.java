package org.example.configuration;

import org.example.Dao;
import org.example.custom.Production;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Production
public class AppConfig1 {

    @Bean
    public Dao dao(){
        return new Dao();
    }
}
