package com.practice.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This Box can hold multiple Boxes or Products in it. this represents the Composite class
 */
public class Box implements Item{
    private List<Item> items = new ArrayList<Item>(); // can have multiple items in the box
    public void add(Item item){
        items.add(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }
}
