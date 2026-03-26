package com.practice.structural.flyweight.before;

/**
 * This Book class used to store the book information and will be stored in memory.
 * Expected to create a million copies of this object.
 */
public record Book(String name, String author, int price, String type, String distributor, String otherData) {
    
}
