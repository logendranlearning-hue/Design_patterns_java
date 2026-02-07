package com.practice.factory.abstractfactory.manufacturer;

import com.practice.factory.abstractfactory.Company;
import com.practice.factory.abstractfactory.keyboard.KeyBoard;
import com.practice.factory.abstractfactory.keyboard.LowProfileKeyBoard;
import com.practice.factory.abstractfactory.mouse.Mouse;
import com.practice.factory.abstractfactory.mouse.OpticalMouse;

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
