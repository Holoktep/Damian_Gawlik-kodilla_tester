package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop;
    Order order1 = new Order(100.50, "2024-02-01", "user1");
    Order order2 = new Order(200.00, "2024-03-05", "user2");
    Order order3 = new Order(150.00, "2023-12-31", "user3");
    Order order4 = new Order(30.00, "2024-01-01", "user1");
    Order order5 = new Order(75.00, "2024-02-01", "user2");
    Order order6 = new Order(120.00, "2024-03-01", "user3");
    Order order7 = new Order(200.00, "2024-04-01", "user4");

    @BeforeEach
    void initializeShop() {
        shop = new Shop();
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
    }

    @Test
    void shouldAddNewOrder() {
        assertEquals(7, shop.getOrderCount());
    }

    @Test
    void shouldReturnOrdersBetweenDates() {
        List<Order> result = shop.getOrdersBetweenDates("2024-01-01", "2024-03-01");
        assertEquals(4, result.size());
    }

    @Test
    void shouldReturnOrdersByValueRange() {
        List<Order> result = shop.getOrdersByValueRange(50.00, 150.00);
        assertEquals(4, result.size());
    }

    @Test
    void shouldReturnCorrectOrderCount() {
        assertEquals(7, shop.getOrderCount());
    }

    @Test
    void shouldReturnTotalOrderValue() {
        assertEquals(875.50, shop.getTotalOrderValue(), 0.01);
    }

    @AfterEach
    void resetShop() {
        System.out.println("Resetting shop state...");
    }

    @BeforeAll
    static void displayIntroMessage() {
        System.out.println("Starting Shop tests");
    }

    @AfterAll
    static void displayGoodByeMessage() {
        System.out.println("Finished Shop tests");
    }
}
