package org.example;

import jakarta.annotation.Resource;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    Dao dao;
    int num;

    public UserService(){}

    public void init(){
        System.out.println("init user service");
    }

    public UserService(@Named("dao2") Dao dao){
        this.dao = dao;
        System.out.println("injected dao in user service");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void close(){

        System.out.println("close user service");
    }

}
