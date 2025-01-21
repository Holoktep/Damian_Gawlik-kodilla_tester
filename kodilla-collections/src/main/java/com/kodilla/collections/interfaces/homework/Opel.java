package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed = 0;
    public Opel(int speed) { // Dodano typ int
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 60;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 17;
        if(speed < 0) {
            speed = 0;
        }
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }
}