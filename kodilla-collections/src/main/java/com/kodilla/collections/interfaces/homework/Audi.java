package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;
    public Audi(int speed) { // Dodano typ int
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
       speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        if(speed < 0) {
            speed = 0;
        }
    }
}
