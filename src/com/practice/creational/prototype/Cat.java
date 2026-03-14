package com.practice.creational.prototype;

public class Cat extends Animal{

    public Cat() {
        super("Cat", 1);
    }
    @Override
    public String sound() {
        return "Meow Meow";
    }
}
