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
        assertFalse(flightsFromWarszawa.contains(new Flight("Warszawa","Lizbona")));
        assertFalse(flightsFromWarszawa.contains(new Flight("Warszawa","Kraków")));
    }

    @Test
    void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToWarszawa = flightFinder.findFlightsTo("Warszawa");
        assertEquals(1, flightsToWarszawa.size());
        assertFalse(flightsToWarszawa.contains(new Flight("Londyn", "Warszawa")));
    }
}