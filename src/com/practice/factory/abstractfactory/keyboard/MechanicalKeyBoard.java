package com.practice.factory.abstractfactory.keyboard;

public class MechanicalKeyBoard implements KeyBoard {
    @Override
    public void assembleKeyBoard() {
        System.out.println("Assembling Mechanical Keyboard");
    }
}
