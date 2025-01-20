package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Tesla;
import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(15) + 1;

        Car[] cars = new Car[size];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int carType = random.nextInt(3);
        int speed = random.nextInt(150) + 50;

        switch (carType) {
            case 0:
                return new Audi(speed);
            case 1:
                return new Tesla(speed);
            case 2:
                return new Opel(speed);
            default:
                return null;
        }
    }
}
