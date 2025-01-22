package com.kodilla.basic_assertion;

import com.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator =  new Calculator();
        int a = 5;
        int b = 8;
        int sumReslut = calculator.sum(a, b);
        assertEquals(13, sumReslut);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double  a = 10.53;
        double squareResult = calculator.square(a);
        assertEquals(110.88, squareResult, 0.001);
    }

    @Test
    public void testSubTract() {
        Calculator calculator = new Calculator();
        int a = 24;
        int b = 15;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(9, subtractResult);

    }
}
