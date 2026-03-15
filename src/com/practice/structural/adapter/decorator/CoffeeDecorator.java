package com.practice.structural.adapter.decorator;

/**
 * This is started for new options for coffee - Decorator base class
 */
public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public double price() {
        return coffee.price();
    }
}
