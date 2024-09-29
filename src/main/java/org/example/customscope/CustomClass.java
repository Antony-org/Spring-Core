package org.example.customscope;

import jakarta.inject.Named;
import org.springframework.stereotype.Component;

@Component("customClass")
public class CustomClass {
   public CustomClass(){
        System.out.println("Custom Class Created");
    }
}
