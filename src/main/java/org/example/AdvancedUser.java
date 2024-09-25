package org.example;

import java.util.List;

public class AdvancedUser extends User {
    private List<String> emails;

    public AdvancedUser() {}

    public void setAdditionalEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getAdditionalEmails() {
        return emails;
    }
}