package com.practice.structural.composite;

/**
 * Client can handle both product and box via common Item interface
 */
public class ClientOrder {
    static void main() {
        // Create individual products
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0);
        Product product3 = new Product("Product 3", 30.0);

        // Create a box and add products to it
        Box box1 = new Box();
        box1.add(product1);
        box1.add(product2);

        // Create another box and add a product to it
        Box box2 = new Box();
        box2.add(product3);

        // Create a main box and add the two boxes to it
        Box mainBox = new Box();
        mainBox.add(box1);
        mainBox.add(box2);

        // Calculate total price of the main box
        double totalPrice = mainBox.getPrice();
        System.out.println("Total Price: " + totalPrice); // Output: Total Price: 60.0
    }
}
