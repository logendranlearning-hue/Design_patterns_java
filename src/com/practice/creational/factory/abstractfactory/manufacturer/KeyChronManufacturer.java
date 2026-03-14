package com.practice.creational.factory.abstractfactory.manufacturer;

import com.practice.creational.factory.abstractfactory.Company;
import com.practice.creational.factory.abstractfactory.keyboard.KeyBoard;
import com.practice.creational.factory.abstractfactory.keyboard.MechanicalKeyBoard;
import com.practice.creational.factory.abstractfactory.mouse.MechanicalMouse;
import com.practice.creational.factory.abstractfactory.mouse.Mouse;

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
