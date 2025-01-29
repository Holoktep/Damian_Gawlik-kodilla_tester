package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromWarszawa = flightFinder.findFlightsFrom("Warszawa");
        assertEquals(2, flightsFromWarszawa.size());
        assertTrue(flightsFromWarszawa.contains(new Flight("Warszawa","Lizbona")));
        assertTrue(flightsFromWarszawa.contains(new Flight("Warszawa","Kraków")));
    }

    @Test
    void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToWarszawa = flightFinder.findFlightsTo("Warszawa");
        assertEquals(1, flightsToWarszawa.size());
        assertTrue(flightsToWarszawa.contains(new Flight("Londyn", "Warszawa")));
    }
}