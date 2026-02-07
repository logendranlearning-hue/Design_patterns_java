package com.practice.factory.abstractfactory.manufacturer;

import com.practice.factory.abstractfactory.Company;
import com.practice.factory.abstractfactory.keyboard.KeyBoard;
import com.practice.factory.abstractfactory.keyboard.MechanicalKeyBoard;
import com.practice.factory.abstractfactory.mouse.MechanicalMouse;
import com.practice.factory.abstractfactory.mouse.Mouse;

public class KeyChronManufacturer extends Company {
    @Override
    public KeyBoard createKeyBoard() {
        return new MechanicalKeyBoard();
    }

    @Override
    public Mouse createMouse() {
        return new MechanicalMouse();
    }
}
