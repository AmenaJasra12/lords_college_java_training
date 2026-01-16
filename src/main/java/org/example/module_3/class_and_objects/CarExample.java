package org.example.module_3.class_and_objects;

public class CarExample {
    int mileage;
    String color;
    int model;
    int companyName;

    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }

    void getTripMileage(int distance, int fuelConsumed) {
        System.out.println("Trip mileage is: " + (distance / fuelConsumed) * mileage + " km/l");
    }

    public static void main(String[] args) {
        // altoK10, bmw are objects (real world entity)
        // Car is a class (blueprint) to create object
        CarExample altoK10 = new CarExample();
        CarExample bmw = new CarExample();
    }
}
