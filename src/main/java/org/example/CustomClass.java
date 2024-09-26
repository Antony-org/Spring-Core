package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CustomClass {
   public CustomClass(){
        System.out.println("Custom Class Created");
    }
}
