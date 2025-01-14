package com.kodilla.abstracts.homework2;

public class Driver extends Job {

    public Driver() {
        super(1000, "Driver");
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("I must know how drive");
    }
}
