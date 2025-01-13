package com.basic_assertion;

public class Square2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 10;
        int squareResult = calculator.square(a, b);
        boolean correct = ResultChecker.assertEquals(100, squareResult);
        if (correct) {
            System.out.println("Metoda square działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}

