package com.practice.structural.facade;

/**
 * This class is a part of the Facade design pattern implementation.
 * It represents an Air Conditioner, which is one of the electrical functions that can be controlled through the HomeAutomationFacade.
 * The AirConditioner class implements the ElectricalFunction interface, providing concrete implementations for the on() and off() methods to control the state of the air conditioner.
 */
public class AirConditioner implements ElectricalFunction {
    @Override
    public void on() {
        System.out.println("Air Conditioner on");
    }
    @Override
    public void off() {
        System.out.println("Air Conditioner off");
    }
}
