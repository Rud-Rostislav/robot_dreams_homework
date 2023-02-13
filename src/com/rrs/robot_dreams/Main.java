package com.rrs.robot_dreams;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mercedes - Benz", 2020, "Легковий автомобіль");
        CarPassenger carPass = new CarPassenger("BMW", 2012);
        CarTruck truck = new CarTruck("DAF", 2007);

        System.out.println("Тип автомобіля класу Car: " + car.getType() + ".");
        System.out.println("Тип автомобіля класу легкового автомобіля: " + carPass.getType() + ".");
        System.out.println("Тип автомобіля класу вантажного автомобіля: " + truck.getType() + ".");

    }
}