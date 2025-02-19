package com.kodilla.execution_model.homework;

public class Order {

    private double value;
    private String date;
    private String user;

    public Order(double value, String date, String user){
        this.date = date;
        this.user = user;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date='" + date + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
