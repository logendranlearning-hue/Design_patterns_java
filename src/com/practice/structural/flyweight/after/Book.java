package com.practice.structural.flyweight.after;

/**
 * This is the context class, and it contains the extrinsic state of the object. This state depends on the context and can be changed at runtime.
 * It maintains a reference to the flyweight object and delegates the intrinsic state to it.
 */
public class Book {
    private final String name;
    private final int price;
    private final BookType bookType;

    public Book(String name, int price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public BookType getBookType() {
        return bookType;
    }
}
