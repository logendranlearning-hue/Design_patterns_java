package com.practice.structural.bridge;

/**
 * HyderabadLocation - concrete implementation of abstraction class
 */
public class HyderabadLocation extends Location {

    public HyderabadLocation(Biriyani biriyani) {
        super(biriyani);
    }

    @Override
    void addRice() {
        biriyani.rice="Basmathi Rice";
    }

    @Override
    void addSpices() {
        biriyani.spices="Hyderabadi Spices";
    }

    @Override
    void addCookingStyle() {
        biriyani.cookingStyle="Dum Cooking";
    }
}
