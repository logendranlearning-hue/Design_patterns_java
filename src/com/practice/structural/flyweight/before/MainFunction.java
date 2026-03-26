package com.practice.structural.flyweight.before;

import com.practice.structural.flyweight.MemoryUtils;

import java.util.List;
import java.util.Random;

/**
 * Create many book objects and store it. We can see how much memory been used for this.
 * Later, we will implement the flyweight pattern to optimize the memory usage by sharing common data among the book objects.
 */
public class MainFunction {

    private static final int BOOKS_TO_INSERT = 10_000_00;

    static void main() {
        long startMemory = MemoryUtils.getMemoryUsage();
        Store store = new Store();
        for (int i = 0; i < BOOKS_TO_INSERT; i++) {
            store.storeBooks(getRandomName(), "author", (int) getRandomPrice(), "Action", "Kalki", "stuff");
            store.storeBooks(getRandomName(), "author", (int) getRandomPrice(), "Fantacy", "Vikadan", "extra");
        }
         store.showBooks();
        MemoryUtils.printMemoryUsage("Before Flyweight", startMemory);
    }

    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }

    private static double getRandomPrice() {
        return new Random().nextDouble(10, 200);
    }
}
