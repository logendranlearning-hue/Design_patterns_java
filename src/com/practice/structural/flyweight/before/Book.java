package com.practice.structural.flyweight.before;

/**
 * This Book class used to store the book information and will be stored in memory.
 * Expected to create a million copies of this object.
 */
public class Book {
    private final String name;
    private final String author;
    private final int price;
    private final String type;
    private final String distributor;
    private final String otherData;

    public Book(String name, String author, int price, String type, String distributor, String otherData) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getOtherData() {
        return otherData;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", distributor='" + distributor + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}
