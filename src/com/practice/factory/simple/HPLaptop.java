package com.practice.factory.simple;

/**
 * HPLaptop class implementing the Laptop interface
 */
public class HPLaptop implements Laptop {
    @Override
    public String assemble() {
        return "Assembling HP Laptop";
    }
}
