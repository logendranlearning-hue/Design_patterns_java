package com.practice.builder.director;

public class FriedRice {

    // ingredients
    private String rice;
    private String vegetables;
    private String meat;
    private String sauce;
    private String spices;

    public void setRice(String rice) {
        this.rice = rice;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setSpices(String spices) {
        this.spices = spices;
    }

    public String getFriedRiceDetails() {
        return "Fried Rice with " + rice + ", " + vegetables + ", " + meat + ", " + sauce + ", and " + spices;
    }

}
