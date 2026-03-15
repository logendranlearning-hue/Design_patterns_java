package com.practice.structural.bridge;

/**
 * This Order class having the Abstraction and Implementor classes.
 * Here Location is abstraction and the Biriyani type is implementation.
 * The abstraction and implementation are very independent and used.
 */
public class Order {
    static void main() {

        Location hyderbadiChicken = new HyderabadLocation(new NonVegBiriyani());
        hyderbadiChicken.deliver();
        System.out.println("====================================");
        Location aamburChicken = new AamburLocation(new NonVegBiriyani());
        aamburChicken.deliver();
        System.out.println("====================================");
        Location hyderbadiVeg = new HyderabadLocation(new VegBiriyani());
        hyderbadiVeg.deliver();
        System.out.println("====================================");
        Location aamburVeg = new AamburLocation(new VegBiriyani());
        aamburVeg.deliver();
        System.out.println("====================================");
    }
}
