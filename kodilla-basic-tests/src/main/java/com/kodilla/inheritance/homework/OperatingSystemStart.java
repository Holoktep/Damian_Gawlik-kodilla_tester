package com.kodilla.inheritance.homework;

public class OperatingSystemStart {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows(2010);
        windows.turnOn();

        OperatingSystem ios = new IOS(2020);
        ios.turnOff();
    }
}
