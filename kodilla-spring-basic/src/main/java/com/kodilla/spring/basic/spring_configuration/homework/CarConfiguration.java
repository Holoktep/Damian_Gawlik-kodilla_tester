package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDate;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car() {
        LocalTime currentTime = LocalTime.now();
        Month currentMonth = LocalDate.now().getMonth();

        switch (currentMonth) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return new SUV(currentTime);
            case JUNE:
            case JULY:
            case AUGUST:
                return new Cabrio(currentTime);
            default:
                return new Sedan(currentTime);
        }
    }
}