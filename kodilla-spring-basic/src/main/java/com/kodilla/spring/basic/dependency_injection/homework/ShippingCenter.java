package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private final CarService carService;
    private final AddressService addressService;

    public ShippingCenter(CarService carService, AddressService addressService) {
        this.carService = carService;
        this.addressService = addressService;
    }

    public void sendPackage(String address, double weight) {
        if (carService.deliverPackage(address, weight)) {
            addressService.success(address);
        } else {
            addressService.fail(address);
        }
    }
}