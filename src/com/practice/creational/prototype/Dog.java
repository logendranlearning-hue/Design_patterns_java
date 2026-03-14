package com.practice.creational.prototype;

public class Dog extends Animal {

    public Dog() {
        super("Dog", 2);
    }

    @Override
    public String sound() {
        return "Bark Bark";
    }

}
