package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productOrder;
    private double quantiti;

    public Order (String orderNumber, String productOrder, double quantiti) {
        this.orderNumber = orderNumber;
        this.productOrder = productOrder;
        this.quantiti = quantiti;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getProductOrder() {
        return productOrder;
    }

    public double getQuantiti() {
        return quantiti;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(quantiti, order.quantiti) == 0 && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(productOrder, order.productOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productOrder, quantiti);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productOrder='" + productOrder + '\'' +
                ", quantiti=" + quantiti +
                '}';
    }
}
