package com.practice.structural.facade;

/**
 * This is Facade class which hides all the sublevel implementation and provides a simple interface to the client.
 * Client can use this class to perform the operations without worrying about the internal implementation.
 */
public class HomeAutomation {
    private AirConditioner airConditioner = null;
    private Fan fan  = null;
    private HomeComputer homeComputer = null;
    private TV tv = null;
    private Light light = null;

    public HomeAutomation() {
        airConditioner = new AirConditioner();
        fan = new Fan();
        homeComputer = new HomeComputer();
        tv = new TV();
        light = new Light();
    }

    public void enteringHome() {
        System.out.println("Entering into home");
        airConditioner.on();
        fan.on();
        homeComputer.on();
        tv.on();
        light.on();
    }

    public void leavingHome() {
        System.out.println("Leaving from home");
        airConditioner.off();
        fan.off();
        homeComputer.off();
        tv.off();
        light.off();
    }
}
