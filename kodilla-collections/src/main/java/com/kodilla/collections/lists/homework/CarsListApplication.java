package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Tesla;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Tesla(30));
        cars.add(new Audi(60));
        cars.add(new Opel(90));

        System.out.println("Cars collection before remove:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(0);
        cars.remove(new Audi(60));

        for (Car car : cars) {
                System.out.println(car + ", speed: " + car.getSpeed());
        }
        System.out.println("collection: " + cars.size());
    }
}
