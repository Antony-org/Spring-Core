package org.example;

public class User {
    String name;

    public User(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
        System.out.println();
        System.out.println("User created: " + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
