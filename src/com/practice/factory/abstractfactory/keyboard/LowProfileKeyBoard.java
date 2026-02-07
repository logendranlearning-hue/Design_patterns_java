package com.practice.factory.abstractfactory.keyboard;

public class LowProfileKeyBoard implements KeyBoard{
    @Override
    public void assembleKeyBoard() {
        System.out.println("Assembling Low Profile Keyboard");
    }
}
