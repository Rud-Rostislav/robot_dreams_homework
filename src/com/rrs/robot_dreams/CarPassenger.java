package com.rrs.robot_dreams;

public class CarPassenger extends Car {

    public CarPassenger(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String getType() {
        return "Passenger";
    }

}