package com.practice.builder.director;

public interface FriedRiceBuilder {
    void addRice();
    void addVegetables();
    void addMeat();
    void addSauce();
    void addSpices();
    FriedRice getFriedRice();

}
