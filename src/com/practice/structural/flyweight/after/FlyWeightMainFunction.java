package com.practice.structural.flyweight.after;

import com.practice.structural.flyweight.MemoryUtils;

import java.util.List;
import java.util.Random;

/**
 * this class demonstrate how the flyweight design pattern saves memory when we optimize the object storing mechanism by sharing the common data among multiple objects instead of creating new instances for each object. In this example, we have a Store class that stores books, and we use the BookFactory to create and manage the shared BookType instances.
 * By doing this, we can significantly reduce the memory usage when storing a large number of books with similar attributes.
 */
public class FlyWeightMainFunction {

    private static final int BOOK_TYPE = 2;
    private static final int BOOKS_TO_INSERT = 10_000_00;

    static void main() {
        long startMemory = MemoryUtils.getMemoryUsage();
        Store store = new Store();
        for (int i = 0; i < BOOKS_TO_INSERT; i++) {
            store.storeBook(getRandomName(), (int) getRandomPrice(), "Action", "Kalki", "stuff");
            store.storeBook(getRandomName(), (int) getRandomPrice(), "Fantacy", "Vikadan", "extra");
        }
        store.showBooks();
        MemoryUtils.printMemoryUsage("Before Flyweight", startMemory); // saved almost ~30 MB saved
    }

    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }

    private static double getRandomPrice() {
        return new Random().nextDouble(10, 200);
    }
}
