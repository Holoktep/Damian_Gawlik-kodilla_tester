package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTest {

    @Test
    void shouldReturnCorrectTypeForSUV() {
        Car car = new SUV(LocalTime.of(12, 0));
        assertEquals("SUV", car.getCarType());
    }

    @Test
    void shouldReturnCorrectTypeForCabrio() {
        Car car = new Cabrio(LocalTime.of(10, 0));
        assertEquals("Cabrio", car.getCarType());
    }

    @Test
    void shouldReturnCorrectTypeForSedan() {
        Car car = new Sedan(LocalTime.of(14, 0));
        assertEquals("Sedan", car.getCarType());
    }
}