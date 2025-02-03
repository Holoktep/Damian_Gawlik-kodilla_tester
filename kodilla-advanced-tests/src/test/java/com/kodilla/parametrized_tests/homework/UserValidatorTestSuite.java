package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource (value = {"Damian334", "Tomek12.", "Holoktep", "AS32-14.25354grtg.nbfg"})
    public void shouldValidateUsername(String username){
        System.out.println("|" + username + "|");
        assertTrue(userValidator.validateUsername(username), username);
    }

    @ParameterizedTest
    @CsvSource(value = {"damianxkuba@gmail.com", "holoko12.13@o2.pl"})
    public void shouldValidateEmail(String email){
        System.out.println(email);
        assertTrue(userValidator.validateEmail(email), email);
    }
}