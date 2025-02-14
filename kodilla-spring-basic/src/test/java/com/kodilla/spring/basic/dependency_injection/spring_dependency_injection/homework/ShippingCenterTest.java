package com.kodilla.spring.basic.dependency_injection.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTest {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    void packageWhenWeightIsLess30() {
        String result = shippingCenter.sendPackage("Katowice, ul. Kotlarza 7", 25.5);
        assertEquals("Package delivered to: Katowice, ul. Kotlarza 7", result);
    }

    @Test
    void packageWhenWeight30() {
        String result = shippingCenter.sendPackage("Tychy, ul. Skośna 21", 35.0);
        assertEquals("Package not delivered to: Tychy, ul. Skośna 21", result);
    }
}