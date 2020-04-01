package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void registerFirstName_givenProperFirstName_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.registerFirstName("Balaji");
        Assert.assertTrue(result);
    }

    @Test
    public void registerLastName_givenProperLastName_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.registerLastName("Ijjapwar");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenImproperEmailId_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.registerEmail("--bijjapwar123@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerMobile_givenProperMobileNo_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.registerMobile("91 7588847291");
        Assert.assertTrue(result);
    }

    @Test
    public void registerPassword_ifPasswordShort_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.registerPassword("12345");
        Assert.assertFalse(result);
    }

    @Test
    public void registerPassword_ifNoUppercaseLetter_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.registerPassword("12345a7c");
        Assert.assertFalse(result);
    }

    @Test
    public void registerPassword_ifNoDigits_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.registerPassword("asfd$uAs");
        Assert.assertFalse(result);
    }

}
