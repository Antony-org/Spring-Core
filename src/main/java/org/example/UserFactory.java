package org.example;

public class UserFactory {
    public User createUser(String firstName, String lastName) {
        return new User(firstName, lastName);
    }
}