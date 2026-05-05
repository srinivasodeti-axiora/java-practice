package com.axiora.oops.inheritance;

class ElectricCar extends Car implements Electric {

    @Override
    public void chargeBattery() {
        System.out.println(brand + " is charging battery...");
    }
}
