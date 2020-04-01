package com.bridgelabz.userregistration;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([_+-.][0-9a-zA-Z]+)*+" +
            "@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{1,3} [0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*\\d)(?=.*[A-Z]).{8,}$";

    public boolean registerFirstName(String firstName) {
        return firstName.matches(NAME_PATTERN);
    }

    public boolean registerLastName(String lastName) {
        return lastName.matches(NAME_PATTERN);
    }

    public boolean registerEmail(String email) {
        return email.matches(EMAIL_PATTERN);
    }

    public boolean registerMobile(String mobile) {
        return mobile.matches(MOBILE_PATTERN);
    }

    public boolean registerPassword(String password) {
        return password.matches(PASSWORD_PATTERN);
    }
}
