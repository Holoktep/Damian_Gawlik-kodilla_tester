package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {
    private final LocalTime time;

    public Cabrio(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return time.isAfter(LocalTime.of(19, 59)) || time.isBefore(LocalTime.of(6, 0));
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}