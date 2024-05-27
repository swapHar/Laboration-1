package com.example.Laboration1;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class ValidatorTest {

    Validator validator;

    @BeforeEach
    void beforeTests(){
        validator = new Validator();

    }

    @Test
    @DisplayName("isPhoneNumberValid method should return true when valid phone number is passed ")
    public void testValidPhoneNumber() {

        String validPhoneNumber = "0123456789";

        boolean isValid = Validator.isPhoneNumberValid(validPhoneNumber);

        Assertions.assertFalse(isValid);
    }

    @Test
    @DisplayName("isPhoneNumberValid method should return false if phone number does not start with 0")
    public void testPhoneNumberDoesNotStartWithZero() {

        String validPhoneNumber = "1123456789";

        boolean isValid = Validator.isPhoneNumberValid(validPhoneNumber);

        Assertions.assertFalse(isValid);
    }

    @Test
    @DisplayName("isPhoneNumberValid method should return false if phone number has less than 6 digits")
    public void testSmallPhoneNumber() {

        String validPhoneNumber = "01234";

        boolean isValid = Validator.isPhoneNumberValid(validPhoneNumber);

        Assertions.assertFalse(isValid);
    }

    @Test
    @DisplayName("isPhoneNumberValid method should return false if phone number has more than 10 digits")
    public void testLargePhoneNumber() {

        String validPhoneNumber = "012345678912";

        boolean isValid = Validator.isPhoneNumberValid(validPhoneNumber);

        Assertions.assertFalse(isValid);
    }


}
