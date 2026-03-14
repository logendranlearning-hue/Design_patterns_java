package com.practice.creational.builder.simple;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final String engineType;
    private final String fuelType;
    private final int mileage;
    private final boolean isHybrid;
    private final boolean hasSunroof;
    private final String insuranceStatus;

    Car(String make, String model, int year, String color, String engineType, String fuelType, int mileage, boolean isHybrid, boolean hasSunroof, String insuranceStatus) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.isHybrid = isHybrid;
        this.hasSunroof = hasSunroof;
        this.insuranceStatus = insuranceStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", mileage=" + mileage +
                ", isHybrid=" + isHybrid +
                ", hasSunroof=" + hasSunroof +
                ", insuranceStatus='" + insuranceStatus + '\'' +
                '}';
    }

}
