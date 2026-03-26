package com.practice.structural.flyweight.after;

/**
 * This is flyweight class, and it should be immutable
 * It stores the intrinsic state of the object. This state is invariant context-independent, shareable and never altered at runtime.
 */
public class BookType {
    private final String type;
    private final String distributor;
    private final String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
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
}
