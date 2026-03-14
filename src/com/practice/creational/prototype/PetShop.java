package com.practice.creational.prototype;

public class PetShop {

    static void main() {
        Dog dog1 = new Dog();
        System.out.println(dog1);
        System.out.println("Dog sound: " + dog1.sound());

        try {
            Dog dog2 = (Dog) dog1.clone();
            dog2.setAge(3);
            dog2.name = "Bad Dog";
            System.out.println(dog2);
            System.out.println("Dog sound: " + dog2.sound());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Cat cat1 = new Cat();
        System.out.println(cat1);
        System.out.println("Cat sound: " + cat1.sound());

        try {
            Cat cat2 = (Cat) cat1.clone();
            System.out.println(cat2);
            System.out.println("Cat sound: " + cat2.sound());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
