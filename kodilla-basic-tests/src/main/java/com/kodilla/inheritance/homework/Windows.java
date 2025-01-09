package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Windows is open");
    }
    @Override
    public void turnOff() {
        System.out.println("Windows is close");
    }
    public Windows(int year){
        super(year);
    }
}
