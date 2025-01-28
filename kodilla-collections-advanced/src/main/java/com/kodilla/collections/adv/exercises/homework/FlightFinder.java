package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> resulte = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                resulte.add(flight);
            }
        }
        return resulte;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> resulte = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                resulte.add(flight);
            }
        }
        return resulte;
    }
}




