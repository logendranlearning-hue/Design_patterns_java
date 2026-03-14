package com.practice.creational.builder.simple;

public class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engineType;
    private String fuelType;
    private int mileage;
    private boolean isHybrid;
    private boolean hasSunroof;
    private String insuranceStatus;

    public CarBuilder make(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder engineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public CarBuilder fuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public CarBuilder mileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public CarBuilder isHybrid(boolean isHybrid) {
        this.isHybrid = isHybrid;
        return this;
    }

    public CarBuilder hasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public CarBuilder insuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
        return this;
    }

    public Car build() {
        return new Car(make, model, year, color, engineType, fuelType, mileage, isHybrid, hasSunroof, insuranceStatus);
    }
}
