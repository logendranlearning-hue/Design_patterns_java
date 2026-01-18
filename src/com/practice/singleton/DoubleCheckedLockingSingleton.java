package com.practice.singleton;

/**
 * A double-checked locking singleton class implementation in Java.
 */
public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance = null;

    // sample variables to demonstrate instance properties

    private String name;
    private int value;

    // Private constructor to prevent instantiation from outside
    private DoubleCheckedLockingSingleton() {
        if (instance != null) {
            throw new IllegalStateException("Instance already exists!");
        } else {
            this.name = "initialName";
            this.value = 0;
        }
    }

    // Public static method to provide access to the instance
    public static DoubleCheckedLockingSingleton getInstance() {
        // First check (no locking)
        if (instance == null) {
            // Synchronize only the first time
            synchronized (DoubleCheckedLockingSingleton.class) {
                // Second check (with locking)
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        } else {
            return instance;
        }
        return instance;
    }

    // Getters for sample variables
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setValue(int value) {
        this.value = value;
    }

}
