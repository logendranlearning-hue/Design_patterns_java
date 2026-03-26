package com.practice.structural.flyweight.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Legacy storing mechanism to store the books.
 */
public class Store {
    private final List<Book> books = new ArrayList<>();

    public void storeBooks(String name, String author, int price, String type, String distributor, String otherData) {
        books.add(new Book(name, author, price, type, distributor, otherData));
    }

    public void showBooks() {
        System.out.println("Storing Books size = " + books.size());
    }
}
