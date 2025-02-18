package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonDataTestSuite {

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.PersonData#testBMI")
    public void CalculatorBmi(double height, double weight, String expectedCategory){
        Person person = new Person(height, weight);
        assertEquals(expectedCategory, person.getBMI());
    }

}