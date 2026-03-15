package com.practice.structural.bridge;

/**
 * Location - Abstraction implementor class (kind of first level abstraction from client)
 */
public abstract class Location {
    protected Biriyani biriyani;
    public Location(Biriyani biriyani) {
        this.biriyani = biriyani;
    }

    abstract void addRice();
    abstract void addSpices();
    abstract void addCookingStyle();

    public  void deliver() {
        addRice();
        addSpices();
        addCookingStyle();
        biriyani.cookBiriyani();
        biriyani.packBiriyani();
    }
}
