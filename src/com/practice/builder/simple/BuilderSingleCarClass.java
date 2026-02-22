package com.practice.builder.simple;

public class BuilderSingleCarClass {

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

    private BuilderSingleCarClass(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engineType = builder.engineType;
        this.fuelType = builder.fuelType;
        this.mileage = builder.mileage;
        this.isHybrid = builder.isHybrid;
        this.hasSunroof = builder.hasSunroof;
        this.insuranceStatus = builder.insuranceStatus;
    }

    @Override
    public String toString() {
        return "BuilderSingleCarClass{" +
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

    public static class Builder {
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

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder fuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Builder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder isHybrid(boolean isHybrid) {
            this.isHybrid = isHybrid;
            return this;
        }

        public Builder hasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder insuranceStatus(String insuranceStatus) {
            this.insuranceStatus = insuranceStatus;
            return this;
        }

        public BuilderSingleCarClass build() {
            return new BuilderSingleCarClass(this);
        }
    }

}
