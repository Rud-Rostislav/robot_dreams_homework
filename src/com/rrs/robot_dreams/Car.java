package com.rrs.robot_dreams;

public class Car {

    private String brand;
    private int year;
    private String type;

    public Car(String brand, int year) {
    }

    public Car(String brand, int year, String type) {
        this.brand = brand;
        this.year = year;
        this.type = type;
    }

    public String getType() {
        return type;
    }

}