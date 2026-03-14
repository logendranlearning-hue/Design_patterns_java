package com.practice.creational.builder.simple;

/**
 * Client class to demonstrate the usage of the Builder pattern for creating Car objects.
 * This class creates instances of Car using the CarBuilder and BuilderSingleCarClass, showcasing how to construct complex objects step by step.
 *
 */

public class Client {

    static void main() {
        Car car = new CarBuilder()
                .make("Toyota")
                .setModel("Camry")
                .setYear(2020)
                .color("Red")
                .engineType("V6")
                .fuelType("Gasoline")
                .mileage(15000)
                .isHybrid(false)
                .hasSunroof(true)
                .insuranceStatus("Insured")
                .build();

        System.out.println(car);

        Car anotherCar = new CarBuilder()
                .make("Honda")
                .setModel("Civic")
                .setYear(2021)
                .color("Blue")
                .engineType("I4")
                .fuelType("Gasoline")
                .mileage(10000)
                .isHybrid(true)
                .hasSunroof(false)
                .insuranceStatus("Insured")
                .build();

        System.out.println(anotherCar);

        System.out.println("Using BuilderSingleCarClass:");

        BuilderSingleCarClass singleCar = new BuilderSingleCarClass.Builder()
                .make("Ford")
                .model("Mustang")
                .year(2019)
                .color("Yellow")
                .engineType("V8")
                .fuelType("Gasoline")
                .mileage(20000)
                .isHybrid(false)
                .hasSunroof(true)
                .insuranceStatus("Insured")
                .build();

        System.out.println(singleCar);

    }
}
