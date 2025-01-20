package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car audi = new Audi(100);
        Car tesla = new Tesla(200);
        Car Opel = new Opel(300);

        System.out.println("Audi");
        doRace(audi);
        System.out.println("Tesla");
        doRace(tesla);
        System.out.println("Opel");
        doRace(Opel);
    }
    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Actual speed: " + car.getSpeed() + " km/h");
    }
}
