package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getTeacherName() {
        String teacherName = Optional.ofNullable(getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        return teacherName;
    }
}

