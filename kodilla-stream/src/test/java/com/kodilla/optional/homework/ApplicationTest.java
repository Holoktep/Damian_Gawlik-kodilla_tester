package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void testTeacherName(){
        Teacher teacher1 = new Teacher("Fizyka");
        Student student = new Student("Tomek", teacher1);
        assertEquals("Fizyka", student.getTeacherName());
    }
    @Test
    void testTeacherNull(){
        Student student = new Student("Kasia", null);
        assertNull(null, student.getTeacherName());
    }
}

