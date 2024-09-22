package org.example;

public class Factory {
    public Service1Impl getService(String model) {
        System.out.println("inside factory: " + model);
        return new Service1Impl(model);
    }

    public Service1Impl getService() {
        System.out.println("inside factory");
        return new Service1Impl();
    }

    public Service1Impl getService(int value) {
        System.out.println("inside factory: " + value);
        return new Service1Impl(value);
    }
}
