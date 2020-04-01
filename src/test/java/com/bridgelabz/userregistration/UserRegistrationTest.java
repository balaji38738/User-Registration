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
}
