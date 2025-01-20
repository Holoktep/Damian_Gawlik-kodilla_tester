package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Tesla;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Car type: " + getCarType(car));
        System.out.println("Speed: " + car.getSpeed() + " km/h");
    }

    private static String getCarType(Car car) {
        if (car instanceof Audi) {
            return "Audi";
        } else if (car instanceof Tesla) {
            return "Tesla";
        } else if (car instanceof Opel) {
            return "Opel";
        } else {
            return "Unknown";
        }
    }
}