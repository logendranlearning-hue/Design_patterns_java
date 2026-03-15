package com.practice.structural.adapter.decorator;

/**
 * This is new add on for coffee that works with decorator - Decorator concrete class
 */
public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String description() {
        return super.description() + " with cream adds 10 Rupees";
    }
    @Override
    public double price()
    {
        return super.price() + 10.0;
    }
}
