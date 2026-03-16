package com.practice.structural.facade;

/**
 * This client class calls the single interface to perform all the complex operation.
 * the single method taking care of complex operations behind.
 * Facade pattern is to enable simple interface to perform chain of complex operations behind.
 */
public class Client {
    static void main() {
        HomeAutomation homeAutomation = new HomeAutomation();
        System.out.println("========================");
        homeAutomation.enteringHome();
        System.out.println("========================");
        homeAutomation.leavingHome();
        System.out.println("========================");
    }
}
