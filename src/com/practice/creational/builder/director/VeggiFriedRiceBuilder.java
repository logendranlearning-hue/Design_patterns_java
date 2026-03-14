package com.practice.creational.builder.director;

public class VeggiFriedRiceBuilder implements FriedRiceBuilder {

    private FriedRice friedRice;

    public VeggiFriedRiceBuilder() {
        this.friedRice = new FriedRice();
    }

    @Override
    public void addRice() {
        friedRice.setRice("Brown Rice");
    }

    @Override
    public void addVegetables() {
        friedRice.setVegetables("Broccoli, Carrots, and Snap Peas");
    }

    @Override
    public void addMeat() {
        friedRice.setMeat("No Meat");
    }

    @Override
    public void addSauce() {
        friedRice.setSauce("Teriyaki Sauce");
    }

    @Override
    public void addSpices() {
        friedRice.setSpices("Sesame Seeds and Green Onions");
    }

    @Override
    public FriedRice getFriedRice() {
        return this.friedRice;
    }

}
