package com.rrs.robot_dreams;

public class CarTruck extends Car {

    public CarTruck(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String getType() {
        return "Truck";
    }

}