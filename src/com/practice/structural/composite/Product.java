package com.practice.structural.composite;

/**
 * This is leaf class which represents the end object (individual object with fixed price) in the composition.
 * It implements the common interface and provides implementation for the common method.
 * It does not have any child objects.
 */
public class Product implements Item {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
