package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        CarService carService = new DeliveryService();
        AddressService addressService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(carService, addressService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}