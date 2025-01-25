package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    private final String name;
    private final List<Integer> studentsInClasses;

    public School(String name, List<Integer> studentsInClasses) {
        this.name = name;
        this.studentsInClasses = studentsInClasses;
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        return studentsInClasses.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return name;
    }
}