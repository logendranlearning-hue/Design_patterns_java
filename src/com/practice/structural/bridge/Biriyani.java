package com.practice.structural.bridge;

/**
 * Biriyani abstract class - This is implementor class
 */
public abstract class Biriyani {
    protected String rice;
    protected String mainIngredient;
    protected String spices;
    protected String cookingStyle;

    public abstract void cookBiriyani();
    public abstract void packBiriyani();
}
