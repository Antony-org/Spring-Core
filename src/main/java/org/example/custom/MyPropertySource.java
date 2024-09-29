package org.example.custom;

import org.springframework.core.env.PropertySource;

public class MyPropertySource extends PropertySource<Object> {

    public MyPropertySource(String name) {
        super(name);
    }

    @Override
    public Object getProperty(String propertyName) {
        Object result = null;

        if (propertyName.equals("userId")) {
            result = "JEDiver";
        } else if (propertyName.equals("userName")) {
            result = "Tony Stark";
        }

        return result;
    }
}