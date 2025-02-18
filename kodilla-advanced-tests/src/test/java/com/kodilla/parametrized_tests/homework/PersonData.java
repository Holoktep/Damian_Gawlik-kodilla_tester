package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonData {

    static Stream<Arguments> testBMI(){
        return Stream.of(
                Arguments.of(1.75, 50, "Underweight"),
                Arguments.of(1.75, 70, "Normal (healthy weight)"),
                Arguments.of(1.75, 90, "Overweight"),
                Arguments.of(1.75, 100, "Obese Class I (Moderately obese)"),
                Arguments.of(1.75, 110, "Obese Class II (Severely obese)"),
                Arguments.of(1.75, 130, "Obese Class III (Very severely obese)")
        );
    }
}
