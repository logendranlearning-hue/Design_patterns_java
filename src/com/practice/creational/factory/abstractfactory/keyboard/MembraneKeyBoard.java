package com.practice.creational.factory.abstractfactory.keyboard;

public class MembraneKeyBoard implements KeyBoard{
    @Override
    public void assembleKeyBoard() {
        System.out.println("Assembling Membrane Keyboard");
    }
}
