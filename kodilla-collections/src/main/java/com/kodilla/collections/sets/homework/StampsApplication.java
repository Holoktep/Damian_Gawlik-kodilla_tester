package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("yes", "Good", 40, 30));
        stamps.add(new Stamp("no", "Bad", 10, 15));
        stamps.add(new Stamp("no", "Angry", 14, 17));
        stamps.add(new Stamp("yes", "Sick", 99, 78));
        stamps.add(new Stamp("yes", "Good", 40, 30));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
