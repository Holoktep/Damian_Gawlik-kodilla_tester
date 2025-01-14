package com.kodilla.abstracts.homework;
public class Application {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        System.out.println("Circle - area: " + circle.calculateArea());
        System.out.println("Circle - perimeter: " + circle.calculatePerimeter());

        Shape square = new Square(10);
        System.out.println("Square - area: " + square.calculateArea());
        System.out.println("Square - Perimeter: " + square.calculatePerimeter());
    }
}