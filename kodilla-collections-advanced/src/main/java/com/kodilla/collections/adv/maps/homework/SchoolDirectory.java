package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();


        Principal marek = new Principal("Marek ", "Kowalski");
        Principal tomek = new Principal("Tomek ", "Fuks");
        Principal robert = new Principal("Robert ", "Okon");


        School podstawowka = new School("Podstawowka", List.of(25, 30, 28, 32));
        School liceum = new School("Liceum", List.of(20, 22, 18, 24));
        School techinkum = new School("Technikum", List.of(15, 16, 20, 19));


        schoolDirectory.put(marek, podstawowka);
        schoolDirectory.put(tomek, liceum);
        schoolDirectory.put(robert, techinkum);


        for (Map.Entry<Principal, School> entry : schoolDirectory.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();
            System.out.println("Principal: " + principal.getFirstname() + principal.getLastname());
            System.out.println("School: " + school.getName());
            System.out.println("Total number of students: " + school.getTotalStudents());
            System.out.println();
        }
    }
}