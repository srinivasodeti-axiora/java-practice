package com.axiora.oops.inheritance;

// Base class
class Vehicle {
    String brand;
    int speed;

    void start() {
        System.out.println(brand + " is starting..."+speed);
    }

    void stop() {
        System.out.println(brand + " is stopping...");
    }
}