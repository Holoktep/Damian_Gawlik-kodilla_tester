package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int radius;

    public Triangle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }
}