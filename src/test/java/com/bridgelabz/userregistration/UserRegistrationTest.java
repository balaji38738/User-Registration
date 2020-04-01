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
}
