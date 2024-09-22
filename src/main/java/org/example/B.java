package org.example;

public class B {
    private A a;

    public B(A a) {
        this.a = a;
        System.out.println("inside B constructor with A injected");

    }

    public B() {
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
        System.out.println("inside B setter with A injected");
    }
}