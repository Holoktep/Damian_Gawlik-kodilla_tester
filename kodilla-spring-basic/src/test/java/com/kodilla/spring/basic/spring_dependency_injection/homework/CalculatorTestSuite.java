package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.spring_dependency_injection.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    void testCalculatorAdd(){
        double addResult = calculator.add(10, 10);
        assertEquals(20, addResult);
    }

    @Test
    void testCalculatorSub(){
        double subResult = calculator.subtract(10, 5);
        assertEquals(5, subResult);
    }

    @Test
    void testCalculatorMultiply(){
        double multResult = calculator.multiply(12, 5);
        assertEquals(60, multResult);
    }

    @Test
    void testCalculatorDivide(){
        double divResult = calculator.divide(8,2);
        assertEquals(4, divResult);
    }

}