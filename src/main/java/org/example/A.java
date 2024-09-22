package org.example;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
        System.out.println("inside A constructor with B injected");
    }

    public A() {
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}