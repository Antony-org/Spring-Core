package org.example;

import jakarta.annotation.Resource;
import org.example.custom.DAOQualifier;
import org.example.custom.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class User {
    @Autowired
    String name;
    List <String> emails;
    @Autowired
    @DAOQualifier(name = "customDAO", mobile = Mobile.Vodafone)
    Address address;

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

    @Resource(name = "address")
    public void setAddress(Address address) {
        this.address = address;
    }
}
