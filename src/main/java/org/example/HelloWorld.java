package org.example;

public class HelloWorld {
    private String message;

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Hello World Message: " + message);
    }
}