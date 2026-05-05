package com.axiora.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.numberOfDoors = 4;

        car.start();  // inherited
        car.honk();   // own method


        ElectricCar ec = new ElectricCar();
        ec.brand = "Tesla";
        ec.speed = 150;

        ec.start();          // from Vehicle
        ec.honk();           // from Car
        ec.chargeBattery();  // from Electric interface
    }
}