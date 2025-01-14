package com.kodilla.abstracts.homework2;

public class Plumber extends Job {

    public Plumber() {
        super(2000, "Plumber");
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("I must know how use key");
    }
}
