package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    @Test
    public void shouldHowManyWins() throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(15);
        numbers.add(46);
        numbers.add(24);
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class , () -> gamblingMachine.howManyWins(numbers));

    }

    @Test
    public void shouldIsAnyNumberOutOfDeclaredScope() throws InvalidNumbersException{
        Set<Integer> numbers = new HashSet<>();
        numbers.add(66);
        numbers.add(76);
        numbers.add(0);
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @Test
    public void shouldWin() throws InvalidNumbersException{
        Set<Integer> numbers = new HashSet<>();
        numbers.add(14);
        numbers.add(12);
        numbers.add(15);
        numbers.add(45);
        numbers.add(44);
        numbers.add(23);
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertTrue(gamblingMachine.howManyWins(numbers) >= 0);
    }
}

