package com.rrs.robot_dreams;

public class Car {

    static int count = 0;
    private final String model;
    private final String color;
    private final int year;

    static {
        System.out.println("Car class is loaded\n");
    }

    {
        count++;
        System.out.println("Car number " + count + " was created.\n");
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        System.out.println("Constructor was called.\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

}