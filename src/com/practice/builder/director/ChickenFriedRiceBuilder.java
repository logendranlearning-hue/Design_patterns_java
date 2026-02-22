package com.practice.builder.director;

public class ChickenFriedRiceBuilder implements FriedRiceBuilder{

    private FriedRice friedRice;

    public ChickenFriedRiceBuilder() {
        this.friedRice = new FriedRice();
    }

    @Override
    public void addRice() {
        friedRice.setRice("Basmati Rice");
    }

    @Override
    public void addVegetables() {
        friedRice.setVegetables("Carrots, Peas, and Corn");
    }

    @Override
    public void addMeat() {
        friedRice.setMeat("Chicken");
    }

    @Override
    public void addSauce() {
        friedRice.setSauce("Soy Sauce");
    }

    @Override
    public void addSpices() {
        friedRice.setSpices("Garlic and Ginger");
    }

    @Override
    public FriedRice getFriedRice() {
        return this.friedRice;
    }
}
