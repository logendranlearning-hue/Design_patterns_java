package com.practice.structural.facade;

/**
 * This class represents a home computer in the home automation system.
 * It implements the ElectricalFunction interface, which means it has to implement the on and off methods.
 * The on method will print "Home Computer on" and the off method will print "Home Computer off".
 * This class is used in the HomeAutomationFacade class to control the home computer along with other electrical functions in the home.
 */
public class HomeComputer implements ElectricalFunction {

    @Override
    public void on() {
        System.out.println("Home Computer on");
    }

    @Override
    public void off() {
        System.out.println("Home Computer off");
    }
}
