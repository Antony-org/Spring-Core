package org.example;

import java.util.List;

public class User {
    String name;
    List <String> emails;
    Address address;

    public void init(){
        System.out.println("inside init method");
    }

    public void destroy(){
        System.out.println("inside destroy method");
    }

    public User() {}

    public void setName(String name) {
        System.out.println("inside name setter");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
