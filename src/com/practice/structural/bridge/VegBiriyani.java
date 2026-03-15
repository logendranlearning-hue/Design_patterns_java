package com.practice.structural.bridge;

/**
 * VegBiriyani - this is concrete implementation for the implementor class
 */
public class VegBiriyani extends Biriyani {

    @Override
    public void cookBiriyani() {
        mainIngredient = "Vegetables";
        System.out.println("Adding Rice : "+rice);
        System.out.println("Adding mainIngredient : "+mainIngredient);
        System.out.println("Adding spices : "+spices);
        System.out.println("Adding cookingStyle : "+cookingStyle);

    }

    @Override
    public void packBiriyani() {
        System.out.println("Packing Veg Biriyani in eco-friendly packaging");
    }

}
