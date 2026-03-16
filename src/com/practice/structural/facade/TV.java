package com.practice.structural.facade;

/**
 * This class represents a light in the home automation system.
 * It implements the ElectricalFunction interface, which means it has to implement the on and off methods.
 * The on method will print "Light on" and the off method will print "Light off".
 * This class is used in the HomeAutomationFacade class to control the light along with other electrical functions in the home.
 */
public class TV implements ElectricalFunction {
    @Override
    public void on() {
        System.out.println("TV on");
    }
    @Override
    public void off() {
        System.out.println("TV off");
    }
}
