package com.kodilla.spring.basic.dependency_injection.spring_dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void display(double value){
        System.out.println(value);

    }
}
