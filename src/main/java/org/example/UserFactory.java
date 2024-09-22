package org.example;

public class UserFactory {
    public User createUser(String firstName, String lastName) {
        return new User(firstName, lastName);
    }

    public User createUser(Address address) {
        System.out.println("User created with address: " + address.getStreet());
        return new User(address);
    }
}