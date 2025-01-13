package com.kodilla.abstracts;

public class AnimalProcessor{
    public void process(Animal animal) {
        System.out.println("Animal has " + animal.getnumberOfLegs() + " Legs");
        animal.giveVoice();
    }
}
