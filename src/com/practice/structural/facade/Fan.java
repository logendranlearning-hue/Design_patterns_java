package com.practice.structural.facade;

/**
 * This class represents a fan in the home automation system.
 * It implements the ElectricalFunction interface, which means it has to implement the on and off methods.
 * The on method will print "Fan on" and the off method will print "Fan off".
 * This class is used in the HomeAutomationFacade class to control the fan along with other electrical functions in the home.
 */
public class Fan implements ElectricalFunction {

    @Override
    public void on() {
        System.out.println("Fan on");
    }

    @Override
    public void off() {
        System.out.println("Fan off");
    }
}
