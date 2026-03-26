package com.practice.structural.flyweight.after;

/**
 * This is the context class, and it contains the extrinsic state of the object. This state depends on the context and can be changed at runtime.
 * It maintains a reference to the flyweight object and delegates the intrinsic state to it.
 */
public record Book(String name, int price, BookType bookType) {
}
