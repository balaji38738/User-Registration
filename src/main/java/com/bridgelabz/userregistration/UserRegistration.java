package com.bridgelabz.userregistration;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([_+-.][0-9a-zA-Z]+)*+" +
            "@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";

    public boolean registerFirstName(String firstName) {
        return firstName.matches(NAME_PATTERN);
    }

    public boolean registerLastName(String lastName) {
        return lastName.matches(NAME_PATTERN);
    }

    public boolean registerEmail(String email) {
        return email.matches(EMAIL_PATTERN);
    }
}
