package com.practice.structural.decorator;

/**
 * Simple coffee prepared for legacy system - concrete class
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String description() {
        return "Simple Coffee";
    }
    @Override
    public double price() {
        return 30.0;
    }
}
