package com.practice.factory.abstractfactory.mouse;

public class MechanicalMouse implements Mouse {
    @Override
    public void assembleMouse() {
        System.out.println("Assembling Mechanical Mouse");
    }
}
