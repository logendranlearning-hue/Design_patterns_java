package com.practice.creational.builder.director;

public class Customer {

    static void main() {
        // Create a builder for a specific type of fried rice
        FriedRiceBuilder chickenFriedRiceBuilder = new ChickenFriedRiceBuilder();

        // Create a director and set the builder
        CookDirector cookDirector = new CookDirector(chickenFriedRiceBuilder);

        // Cook the fried rice
        FriedRice chickenFriedRice = cookDirector.cookFriedRice();

        // Print the details of the cooked fried rice
        System.out.println(chickenFriedRice.getFriedRiceDetails());

        // create another builder for a different type of fried rice
        FriedRiceBuilder vegetableFriedRiceBuilder = new VeggiFriedRiceBuilder();

        // set the new builder in the director
        cookDirector.setFriedRiceBuilder(vegetableFriedRiceBuilder);

        // cook the new type of fried rice
        FriedRice vegetableFriedRice = cookDirector.cookFriedRice();

        // print the details of the new type of fried rice
        System.out.println(vegetableFriedRice.getFriedRiceDetails());

    }
}
