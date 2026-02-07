package com.practice.factory.abstractfactory;

import com.practice.factory.abstractfactory.keyboard.KeyBoard;
import com.practice.factory.abstractfactory.mouse.Mouse;

public abstract class Company {
    public abstract KeyBoard createKeyBoard();
    public abstract Mouse createMouse();

    public KeyBoard orderKeyBoard() {
        KeyBoard keyBoard = createKeyBoard();
        keyBoard.assembleKeyBoard();
        return keyBoard;
    }

    public Mouse orderMouse() {
        Mouse mouse = createMouse();
        mouse.assembleMouse();
        return mouse;
    }
}
