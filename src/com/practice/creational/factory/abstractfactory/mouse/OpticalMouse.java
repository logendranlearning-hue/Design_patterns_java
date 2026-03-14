package com.practice.creational.factory.abstractfactory.mouse;

public class OpticalMouse implements Mouse{
    @Override
    public void assembleMouse() {
        System.out.println("Assembling Optical Mouse");
    }
}
