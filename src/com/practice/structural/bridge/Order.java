package com.practice.structural.bridge;

/**
 * This Order class having the Abstraction and Implementor classes.
 * Here Location is abstraction and the Biriyani type is implementation.
 * The abstraction and implementation are very independent and used.
 */
public class Order {
    static void main() {
        // the order only dealing with abstraction not the implementation.
        // calls the deliver() method but implementation taking care of all the required method calls
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
