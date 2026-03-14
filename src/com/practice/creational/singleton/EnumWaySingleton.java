package com.practice.creational.singleton;

public enum EnumWaySingleton {
    INSTANCE;

    // sample variables to demonstrate instance properties
    private String name;
    private int value;

    // Private constructor to initialize the singleton instance
    private EnumWaySingleton() {
        this.name = "initialName";
        this.value = 0;
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
