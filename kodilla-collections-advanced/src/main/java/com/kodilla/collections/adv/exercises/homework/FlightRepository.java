package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Berlin", "Paryż"));
        flights.add(new Flight("Londyn", "Warszawa"));
        flights.add(new Flight("Warszawa", "Lizbona"));
        return flights;
    }
}
