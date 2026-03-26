package com.practice.structural.flyweight.after;

/**
 * This is flyweight class, and it should be immutable
 * It stores the intrinsic state of the object. This state is invariant context-independent, shareable and never altered at runtime.
 */
public record BookType(String type, String distributor, String otherData) {
}
