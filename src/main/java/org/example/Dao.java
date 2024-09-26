package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class Dao {

    @PostConstruct
    public void init(){
        System.out.println("init dao");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy dao");
    }
}
