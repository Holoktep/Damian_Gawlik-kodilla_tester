package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("001"));
        warehouse.addOrder(new Order("002"));
        warehouse.addOrder(new Order("003"));
        warehouse.addOrder(new Order("002"));

        try {
            Order foundOrder = warehouse.getOrder("002");
            System.out.println("Found order: " + foundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.err.println(e.getMessage());
        }
    }
}
