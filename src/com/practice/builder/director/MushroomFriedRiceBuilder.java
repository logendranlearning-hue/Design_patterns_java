package com.practice.builder.director;

public class MushroomFriedRiceBuilder implements FriedRiceBuilder{

    private FriedRice friedRice;

    public MushroomFriedRiceBuilder() {
        this.friedRice = new FriedRice();
    }

    @Override
    public void addRice() {
        friedRice.setRice("Jasmine Rice");
    }

    @Override
    public void addVegetables() {
        friedRice.setVegetables("Bell Peppers, Onions, and Mushrooms");
    }

    @Override
    public void addMeat() {
        friedRice.setMeat("No Meat");
    }

    @Override
    public void addSauce() {
        friedRice.setSauce("Oyster Sauce");
    }

    @Override
    public void addSpices() {
        friedRice.setSpices("Black Pepper and Chili Flakes");
    }

    @Override
    public FriedRice getFriedRice() {
        return this.friedRice;
    }
}
