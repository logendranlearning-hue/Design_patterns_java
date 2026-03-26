package com.practice.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

/**
 * This is Factory class demonstrate the flyweight pattern, and it is responsible for creating and managing the flyweight objects.
 * It ensures that flyweight objects are shared properly.
 * When the client requests a flyweight object, the factory either returns an existing instance or creates a new one if it doesn't exist.
 */
public class BookFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
       return bookTypes.computeIfAbsent(type, t -> new BookType(t, distributor, otherData));
    }
}
