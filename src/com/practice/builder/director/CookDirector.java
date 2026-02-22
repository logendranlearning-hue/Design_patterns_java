package com.practice.builder.director;

public class CookDirector {

    private FriedRiceBuilder friedRiceBuilder;

    public CookDirector(FriedRiceBuilder friedRiceBuilder) {
        this.friedRiceBuilder = friedRiceBuilder;
    }

    public void setFriedRiceBuilder(FriedRiceBuilder friedRiceBuilder) {
        this.friedRiceBuilder = friedRiceBuilder;
    }

    public FriedRice cookFriedRice() {
        friedRiceBuilder.addRice();
        friedRiceBuilder.addVegetables();
        friedRiceBuilder.addMeat();
        friedRiceBuilder.addSauce();
        friedRiceBuilder.addSpices();
        return friedRiceBuilder.getFriedRice();
    }
}
