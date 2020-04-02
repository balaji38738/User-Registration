package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class UserRegistrationTest {
    public UserRegistration userRegistration;

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void registerFirstName_givenProperFirstName_shouldReturnTrue() {
        boolean result = userRegistration.registerFirstName("Balaji");
        Assert.assertTrue(result);
    }

    @Test
    public void registerLastName_givenProperLastName_shouldReturnTrue() {
        boolean result = userRegistration.registerLastName("Ijjapwar");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenImproperEmailId_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("--bijjapwar123@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerMobile_givenProperMobileNo_shouldReturnTrue() {
        boolean result = userRegistration.registerMobile("91 7588847291");
        Assert.assertTrue(result);
    }

    @Test
    public void registerPassword_ifPasswordShort_shouldReturnFalse() {
        boolean result = userRegistration.registerPassword("12345");
        Assert.assertFalse(result);
    }

    @Test
    public void registerPassword_ifNoUppercaseLetter_shouldReturnFalse() {
        boolean result = userRegistration.registerPassword("12345a7c");
        Assert.assertFalse(result);
    }

    @Test
    public void registerPassword_ifNoDigits_shouldReturnFalse() {
        boolean result = userRegistration.registerPassword("asfd$uAs");
        Assert.assertFalse(result);
    }

    @Test
    public void registerPassword_Only1SpecialChar_shouldReturnTrue() {
        boolean result = userRegistration.registerPassword("@11asfduAs");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample1_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample2_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample3_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc.100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample4_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc111@abc.com");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample5_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc-100@abc.net");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample6_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc.100@abc.com.au");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample7_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc@1.com");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample8_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc@gmail.com.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample9_shouldReturnTrue() {
        boolean result = userRegistration.registerEmail("abc+100@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmail_givenSample10_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample11_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc@.com.my");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample12_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc123@.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample13_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc123@.com.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample14_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail(".abc@abc.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample15_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc()*@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample16_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc@%*.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample17_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc@gmail.com.aa.au");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample18_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc..2002@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample19_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc.@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample20_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc@abc@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void registerEmail_givenSample21_shouldReturnFalse() {
        boolean result = userRegistration.registerEmail("abc@gmail.com.1a");
        Assert.assertFalse(result);
    }
}
