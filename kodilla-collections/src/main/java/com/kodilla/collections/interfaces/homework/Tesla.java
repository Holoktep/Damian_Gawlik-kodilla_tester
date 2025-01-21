package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {
    private int speed = 0;
    public Tesla(int speed) { // Dodano typ int
        this.speed = speed;
    }
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

    @Override
    public String toString() {
        return "Tesla{" +
                "speed=" + speed +
                '}';
    }
}