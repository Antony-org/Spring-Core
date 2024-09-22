package org.example;

public class Service1Impl {

    private int value;
    private String name;

    // Default constructor
    public Service1Impl() {
        System.out.println("Default constructor called");
    }

    // Constructor with int argument
    public Service1Impl(int value) {
        this.value = value;
        System.out.println("Constructor with int: " + value);
    }

    // Constructor with String argument
    public Service1Impl(String name) {
        this.name = name;
        System.out.println("Constructor with String: " + name);
    }

    // Optional: Getters to verify if the beans are initialized properly
    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    // Factory method
    public static Service1Impl getBean(int value) {
        System.out.println("factory method called: " + value);
        return new Service1Impl(value);
    }
}