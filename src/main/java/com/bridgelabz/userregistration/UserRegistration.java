package com.bridgelabz.userregistration;

public class UserRegistration {
    public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    public boolean registerFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }
}
