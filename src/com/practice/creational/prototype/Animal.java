package com.practice.creational.prototype;

public abstract class Animal implements Cloneable {
    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract String sound();

    @Override
    protected Animal clone()  throws CloneNotSupportedException {
        Animal animal = null;
        try {
            animal = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException("Cloning not supported for this animal");
        }
        return animal;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + '}';
    }

}
