package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle - field: " + circle.calculateArea());
        System.out.println("Circle - perimeter: " + circle.calculatePerimeter());

        Shape square = new Square(10);
        System.out.println("Square - field: " + square.calculateArea());
        System.out.println("Square - perimeter: " + square.calculatePerimeter());

        Shape triangle = new Triangle(15);
        System.out.println("Triangle - field: " + triangle.calculateArea());
        System.out.println("Triangle - perimeter: " + triangle.calculatePerimeter());
    }
}