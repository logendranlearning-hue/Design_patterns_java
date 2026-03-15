package com.practice.structural.bridge;

/**
 * AamburLocation - concrete implementation of abstraction class
 */
public class AamburLocation extends Location {
    public AamburLocation(Biriyani biriyani) {
        super(biriyani);
    }

    @Override
    void addRice() {
        biriyani.rice="Seeraga Samba Rice";
    }

    @Override
    void addSpices() {
        biriyani.spices="Aambur Spices";
    }

    @Override
    void addCookingStyle() {
        biriyani.cookingStyle="Cooker Cooking";
    }
}
