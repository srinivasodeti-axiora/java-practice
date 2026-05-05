package com.axiora.oops;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.brand = "Generic";
        v.speed = 60;

        v.start();
        v.stop();
    }
}