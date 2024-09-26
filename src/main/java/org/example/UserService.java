package org.example;

import jakarta.annotation.Resource;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    Dao dao;

    UserService(@Named("dao2") Dao dao){
        this.dao = dao;
        System.out.println("injected dao in user service");
    }


}
