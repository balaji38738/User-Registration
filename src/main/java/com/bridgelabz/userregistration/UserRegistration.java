package com.bridgelabz.userregistration;

public class UserRegistration {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public boolean registerFirstName(String firstName) {
        return firstName.matches(NAME_PATTERN);
    }

    public boolean registerLastName(String lastName) {
        return lastName.matches(NAME_PATTERN);
    }
}
