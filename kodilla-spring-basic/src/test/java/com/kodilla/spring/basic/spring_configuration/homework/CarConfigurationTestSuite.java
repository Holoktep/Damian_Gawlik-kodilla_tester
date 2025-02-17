package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTest {

    @Test
    void shouldTurnOnHeadlightsAtNightForSUV() {
        Car car = new SUV(LocalTime.of(21, 0)); // Noc
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnCorrectTypeForSUV() {
        Car car = new SUV(LocalTime.of(12, 0));
        assertEquals("SUV", car.getCarType());
    }
    
    @Test
    void shouldTurnOffHeadlightsDuringDayForCabrio() {
        Car car = new Cabrio(LocalTime.of(10, 0)); // Dzień
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnCorrectTypeForCabrio() {
        Car car = new Cabrio(LocalTime.of(10, 0));
        assertEquals("Cabrio", car.getCarType());
    }

    @Test
    void shouldTurnOnHeadlightsAtNightForSedan() {
        Car car = new Sedan(LocalTime.of(23, 0)); // Noc
        assertTrue(car.hasHeadlightsTurnedOn());
    }


    @Test
    void shouldReturnCorrectTypeForSedan() {
        Car car = new Sedan(LocalTime.of(14, 0));
        assertEquals("Sedan", car.getCarType());
    }
}
