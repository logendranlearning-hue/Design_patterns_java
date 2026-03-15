package com.practice.structural.adapter.decorator;

/**
 * Coffee shop class where the orders are been palced
 */
public class Shop {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee(); // ordering a simple coffee from legacy system
        coffee = new SugarDecorator(coffee); // Adding sugar add on with same system implementation
        coffee = new CreamDecorator(coffee); // Adding cream add on with same system implementation

        // printing the bill with details and cost
        System.out.println("Order: " + coffee.description());
        System.out.println("Total Cost: " + coffee.price());
    }

}
