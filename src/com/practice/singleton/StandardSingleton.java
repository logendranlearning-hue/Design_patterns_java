package com.practice.singleton;

/**
 * A standard singleton class implementation in Java.
 */
public class StandardSingleton {
    // Private static variable to hold the single instance of the class
    private static StandardSingleton instance = null;

    // sample variables to demonstrate instance properties
    private String name;
    private int value;

    // Private constructor to prevent instantiation from outside
    private StandardSingleton() {
        if(instance != null) {
            throw new IllegalStateException("Instance already exists!");
        } else {
            this.name = "initialName";
            this.value = 0;
        }
    }

    // Public static method to provide access to the instance
    public static StandardSingleton getInstance() {
        if (instance == null) {
            instance = new StandardSingleton();
        }
        return instance;
    }

    // Getters for sample variables
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
