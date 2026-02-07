package com.practice.factory.simple;

/**
 * LenovoLaptop class implementing the Laptop interface
 */
public class LenovoLaptop implements Laptop {
    @Override
    public String assemble() {
        return "Assembling Lenovo Laptop";
    }
}
