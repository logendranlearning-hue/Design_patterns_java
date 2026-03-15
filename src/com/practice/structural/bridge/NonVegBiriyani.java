package com.practice.structural.bridge;

/**
 * NonVegBiriyani - this is concrete implementation for the implementor class
 */
public class NonVegBiriyani extends Biriyani{

    @Override
    public void cookBiriyani() {
        mainIngredient = "Chicken";
        System.out.println("Adding Rice : "+rice);
        System.out.println("Adding mainIngredient : "+mainIngredient);
        System.out.println("Adding spices : "+spices);
        System.out.println("Adding cookingStyle : "+cookingStyle);
    }

    @Override
    public void packBiriyani() {
        System.out.println("Packing Non Veg Biriyani in Plastic bucket packaging");
    }
}
