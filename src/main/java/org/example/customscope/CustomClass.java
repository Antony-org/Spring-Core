package org.example.customscope;

import jakarta.inject.Named;

@Named("customClass")
public class CustomClass {
   public CustomClass(){
        System.out.println("Custom Class Created");
    }
}
