package com.kodilla.inheritance.homework;

public class IOS extends OperatingSystem {
    @Override
    public void turnOn(){
        System.out.println("IOS is open");
    }
    @Override
    public void turnOff(){
        System.out.println("IOS is close");
    }
    public IOS(int year) {
         super (year);

    }

}
