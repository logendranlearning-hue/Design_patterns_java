package com.practice.structural.facade;

/**
 * This is the interface for all the electrical functions in the home.
 * It has two methods, on and off, which will be implemented by the classes that implement this interface.
 * This interface is used to create a facade for the home automation system, which will allow the user to control all the electrical functions in the home with a single interface.
 */
public interface ElectricalFunction {
    void on();
    void off();
}
