package com.practice.creational.factory.simple;

/**
 * Simple Factory Pattern Example
 * This class demonstrates the simple factory pattern by creating different types of laptops
 * based on the brand specified.
 *
 * Features of Factory Method Design Pattern
 * The Factory Method Pattern provides a structured way to create objects while keeping the client independent of their concrete classes.
 *
 * Encapsulation of Object Creation: Clients don’t know how objects are created.
 * Loose Coupling: Reduces dependency between client and concrete classes.
 * Scalability: New product types can be introduced without altering client code.
 * Reusability: Common creation logic can be reused across factories.
 * Flexibility: Supports multiple product families with minimal changes.
 * Testability: Easy to use mock factories for unit testing
 * Use of Factory Method
 * The Factory Method is useful when you want to simplify object creation and keep your system flexible for future changes.
 *
 * When object creation logic is complex or varies based on conditions.
 * When the system needs to be open for extension but closed for modification (OCP).
 * When new product types may be added in the future.
 * When you want to decouple client code from concrete implementations.
 * Real World Software Examples
 * Factory Method pattern is widely used in software to create objects in a flexible, scalable, and decoupled way.
 *
 * Used in JDBC for creating connections and in frameworks like Spring for managing beans.
 * Libraries like Swing and JavaFX use factories to create flexible UI components.
 * Tools like Log4j rely on factories to create configurable loggers.
 * Factories help create objects from serialized data, supporting various formats.
 * An E-Commerce Platform may create a ProductFactory to create different types of products at runtime. A Notification System may use it to create different types of notifications like WhatsApp, SMS, etc.
 * Components of Factory Method Design Pattern
 * Below are the main components of Factory Design Pattern:
 *
 * Product: Abstract interface or class for objects created by the factory.
 * Concrete Product: The actual object that implements the product interface.
 * Creator (Factory Interface/Abstract Class): Declares the factory method.
 * Concrete Creator (Concrete Factory): Implements the factory method to create specific products.
 *
 */
public class LaptopShop {

    // Main method to test the simple factory pattern
    public static void main(String[] args) {
        String brand = "Lenovo"; // This can be changed to "HP" or "Lenovo" to test other brands
        Laptop laptop;
        switch (brand) {
            case "Acer":
                laptop = new AcerLaptop();
                break;
            case "HP":
                laptop = new HPLaptop();
                break;
            case "Lenovo":
                laptop = new LenovoLaptop();
                break;
            default:
                throw new IllegalArgumentException("Unknown brand: " + brand);
        }
        System.out.println(laptop.assemble());
    }
}
