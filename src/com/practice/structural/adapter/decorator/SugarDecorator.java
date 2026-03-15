package com.practice.structural.adapter.decorator;

/**
 * This is new add on for coffee that works with decorator - Decorator concrete class
 */
public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + " with sugar adds 5 Rupees";
    }

    @Override
    public double price() {
        return super.price() + 5.0;
    }

}
