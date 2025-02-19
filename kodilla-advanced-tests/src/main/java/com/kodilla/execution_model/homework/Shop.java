package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersBetweenDates(String from, String to) {
        return orders.stream()
                .filter(order -> order.getDate().compareTo(from) >= 0 && order.getDate().compareTo(to) <= 0)
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByValueRange(double min, double max) {
        return orders.stream()
                .filter(order -> order.getValue() >= min && order.getValue() <= max)
                .collect(Collectors.toList());
    }

    public int getOrderCount() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        return orders.stream().mapToDouble(Order::getValue).sum();
    }
}

