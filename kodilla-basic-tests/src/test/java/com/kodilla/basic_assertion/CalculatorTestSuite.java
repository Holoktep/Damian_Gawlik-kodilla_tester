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
}
