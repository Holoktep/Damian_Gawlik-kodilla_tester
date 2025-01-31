package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Fizyka");
        Teacher teacher2 = new Teacher("Polski");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Damian", teacher1));
        students.add(new Student("Karol", teacher2));
        students.add(new Student("Kasia", null));
        students.add(new Student("Wiktoria", null));

        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            if (student.getTeacher() != null) {
                System.out.println("  Teacher: " + student.getTeacher().getName());
            } else {
                System.out.println("  Teacher: None");
            }
        }

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Student: " + student.getName() + " Teacher: " + teacherName);
        }
    }
}

