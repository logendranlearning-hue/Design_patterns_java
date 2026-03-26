package com.practice.structural.flyweight.after;

import java.util.ArrayList;
import java.util.List;

/**
 * This Store class showcase how to store the books in the store, and it is the client class that uses the flyweight objects.
 * It creates and manages the context objects, and it interacts with the flyweight objects through their interfaces.
 */
public class Store {
    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, int price, String type, String distributor, String otherData) {
        BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }

    public void showBooks() {
        System.out.println("Storing Books size = " + books.size());
    }
}
