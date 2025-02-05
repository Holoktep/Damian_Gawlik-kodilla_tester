package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    @Test
    void testTeacherName(){
        Teacher teacher1 = new Teacher("Fizyka");
        Student student = new Student("Tomek", teacher1);
        assertEquals("Fizyka", student.getTeacherName());
    }
}

zrob test gdzie teacher jest null