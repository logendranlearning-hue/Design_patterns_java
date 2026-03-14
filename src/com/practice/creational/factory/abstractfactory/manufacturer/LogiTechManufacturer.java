package com.practice.creational.factory.abstractfactory.manufacturer;

import com.practice.creational.factory.abstractfactory.Company;
import com.practice.creational.factory.abstractfactory.keyboard.KeyBoard;
import com.practice.creational.factory.abstractfactory.keyboard.LowProfileKeyBoard;
import com.practice.creational.factory.abstractfactory.mouse.Mouse;
import com.practice.creational.factory.abstractfactory.mouse.OpticalMouse;

public class LogiTechManufacturer extends Company {
    @Override
    public KeyBoard createKeyBoard() {
        return new LowProfileKeyBoard();
    }

    @Override
    public Mouse createMouse() {
        return new OpticalMouse();
    }
}
