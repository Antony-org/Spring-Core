package org.example;

import org.example.custom.Production;
import org.springframework.stereotype.Component;

@Production
@Component
public class Dummy {

    public Dummy() {
        System.out.println("inside dummy constructor");
    }

}
