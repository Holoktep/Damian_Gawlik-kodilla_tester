package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 12;
        if(speed < 0) {
            speed = 0;
        }
    }
}