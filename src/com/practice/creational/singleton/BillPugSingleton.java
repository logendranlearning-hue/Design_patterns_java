package com.practice.creational.singleton;

/**
 * This BillPug singleton class demonstrate that the BillPugSingleton class is a singleton class that can only have one instance.
 * It uses a helper class to create the instance of the singleton class.
 * This is a thread-safe way to create a singleton class in Java.
 * The instance is created when the getInstance() method is called for the first time.
 * The helper class is loaded only when the getInstance() method is called, which ensures that the instance is created only when it is needed.
 */
public class BillPugSingleton {

    // private constructor
    private BillPugSingleton() {
    }

    // helper class to create the instance of the singleton class
    private static class BillPugSingletonHelper {
        private static final BillPugSingleton INSTANCE = new BillPugSingleton();
    }

    // public method to provide access to the instance
    public static BillPugSingleton getInstance() {
        return BillPugSingletonHelper.INSTANCE;
    }
}

