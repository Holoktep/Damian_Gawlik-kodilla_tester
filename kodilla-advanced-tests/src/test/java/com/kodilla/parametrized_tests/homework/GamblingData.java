package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class GamblingData {

    public static Stream<Arguments> data(){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(12);
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(70);
        numbers1.add(66);
        return Stream.of(
                Arguments.of(numbers),
                Arguments.of(numbers1)
        );
    }
}
