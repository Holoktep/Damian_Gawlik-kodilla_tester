package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
