package com.practice.factory.abstractfactory;

import com.practice.factory.abstractfactory.keyboard.KeyBoard;
import com.practice.factory.abstractfactory.manufacturer.KeyChronManufacturer;
import com.practice.factory.abstractfactory.manufacturer.LogiTechManufacturer;
import com.practice.factory.abstractfactory.mouse.Mouse;

/**
 * The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It acts as a "factory of factories," where a super-factory creates other factories that in turn produce specific objects.
 *
 * Works around a super-factory that produces multiple factories.
 * Concrete factories created at runtime decide the actual product types.
 * Useful when the system needs to be independent of how products are created or represented.
 * Makes it easy to switch between different groups of related objects without code changes.
 *
 * Real Life Software Examples
 * The Abstract Factory Pattern is widely used to provide a consistent way to create related objects across different platforms or systems.
 *
 * In applications that need to support multiple cloud platforms (e.g., AWS, Azure, Google Cloud), the Abstract Factory Pattern facilitates the creation of cloud-specific services. An abstract factory can define interfaces for services like storage, compute, and networking.
 * In applications that need to support multiple database systems (e.g., SQL, NoSQL), the Abstract Factory Pattern can be used to create database connections and queries. An abstract factory defines interfaces for creating database-related objects.
 *
 * When to use Abstract Factory Pattern
 * Choose using abstract factory pattern when:
 *
 * When your system requires multiple families of related products and you want to ensure compatibility between them.
 * When you need flexibility and extensibility, allowing for new product variants to be added without changing existing client code.
 * When you want to encapsulate the creation logic, making it easier to modify or extend the object creation process without affecting the client.
 * When you aim to maintain consistency across different product families, ensuring a uniform interface for the products.
 *
 * Challenges
 * Below are the main challenges of using abstract factory pattern:
 *
 * The Abstract Factory pattern can add unnecessary complexity to simpler projects with multiple factories and interfaces.
 * Adding new product types may require changes to both concrete factories and the abstract factory interface, impacting existing code.
 * Introducing more factories and product families can quickly increase the number of classes, making code management difficult in smaller projects.
 * It may violate the Dependency Inversion Principle if client code depends directly on concrete factories rather than abstract interfaces.
 * The pattern can lead to tight coupling between the client and the factory interfaces, making it harder to change the factory implementation without affecting the client code.
 *
 * Client class to demonstrate the Abstract Factory pattern for creating computer peripherals.
 * Depending on the company name, it creates the appropriate KeyBoard and Mouse objects.
 */
public class CompanyClient {
    public static void main(String[] args) {

        String company = "LogiTech";
        KeyBoard keyBoard = null;
        Mouse mouse = null;
        switch (company) {
            case "KeyChron":
                Company keyChron = new KeyChronManufacturer();
                keyBoard = keyChron.createKeyBoard();
                mouse = keyChron.createMouse();
                break;
            case "LogiTech":
                Company logiTech = new LogiTechManufacturer();
                keyBoard = logiTech.createKeyBoard();
                mouse = logiTech.createMouse();
                break;
            default:
                System.out.println("Invalid company name");
        }

        keyBoard.assembleKeyBoard();
        mouse.assembleMouse();

    }
}
