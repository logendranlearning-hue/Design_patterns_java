package com.practice.singleton;

/**
 * Main class to test different singleton implementations.
 *
 * Real-World Applications of the Singleton Pattern
 * Logging Systems : Maintain a consistent logging mechanism across an application.
 * Configuration Managers : Centralize access to configuration settings.
 * Database Connections : Manage a single point of database access.
 * Thread Pools : Efficiently manage a pool of threads for concurrent tasks.
 * Cache Managers, Print Spoolers (Single Printer Queue) and Runtime Environments ( java.lang.Runtime is a singleton)
 *
 * Features of the Singleton Design Pattern
 * Single Instance: Ensures only one object of the class exists in the JVM.
 * Global Access Point: Provides a centralized way to access the instance.
 * Lazy or Eager Initialization: An Instance can be created at class load time (eager) or when first needed (lazy).
 * Thread Safety: Can be designed to work correctly in multithreaded environments.
 * Resource Management: Useful for managing shared resources like configurations, logging or database connections.
 * Flexibility in Implementation: Can be implemented using eager initialization, lazy initialization, double-checked locking or an inner static class.
 * When would you like to use the Singleton Method Design Pattern
 * Use the Singleton method Design Pattern when:
 *
 * Consider using the Singleton pattern when you need to ensure that only one instance of a class exists in your application.
 * If you think you might want to extend the class later, the Singleton pattern is a good choice. It allows for subclassing, so clients can work with the extended version without changing the original Singleton.
 * It's important to use it judiciously. Overuse can lead to issues such as hidden dependencies and testing difficulties.
 *
 */
public class SingletonTestMain {

    public static void main(String[] args) {
        // Testing Standard Singleton
        StandardSingleton singleton1 = StandardSingleton.getInstance();
        System.out.printf("Print singleton1 properties. %s , %d, %d \n", singleton1.getName(), singleton1.getValue(), singleton1.hashCode());

        StandardSingleton singleton2 = StandardSingleton.getInstance();
        singleton2.setName("updatedName");
        singleton2.setValue(42);
        System.out.printf("Print singleton2 properties. %s , %d, %d \n", singleton1.getName(), singleton1.getValue(), singleton1.hashCode());

        System.out.println("Are both instances the same? " + (singleton1 == singleton2));

        // Testing Double-Checked Locking Singleton

        DoubleCheckedLockingSingleton dclSingleton1 = DoubleCheckedLockingSingleton.getInstance();
        System.out.printf("Print dclSingleton1 properties. %s , %d, %d \n", dclSingleton1.getName(), dclSingleton1.getValue(), dclSingleton1.hashCode());
        DoubleCheckedLockingSingleton dclSingleton2 = DoubleCheckedLockingSingleton.getInstance();
        dclSingleton2.setName("dclUpdatedName");
        dclSingleton2.setValue(84);
        System.out.printf("Print dclSingleton2 properties. %s , %d, %d \n", dclSingleton1.getName(), dclSingleton1.getValue(), dclSingleton1.hashCode());
        System.out.println("Are both DCL instances the same? " + (dclSingleton1 == dclSingleton2));

        // Testing Enum Singleton
        EnumWaySingleton enumSingleton1 = EnumWaySingleton.INSTANCE;
        System.out.printf("Print enumSingleton1 properties. %s , %d, %d \n", enumSingleton1.getName(), enumSingleton1.getValue(), enumSingleton1.hashCode());
        EnumWaySingleton enumSingleton2 = EnumWaySingleton.INSTANCE;
        enumSingleton2.setName("enumUpdatedName");
        enumSingleton2.setValue(168);
        System.out.printf("Print enumSingleton2 properties. %s , %d, %d \n", enumSingleton1.getName(), enumSingleton1.getValue(), enumSingleton1.hashCode());
        System.out.println("Are both Enum instances the same? " + (enumSingleton1 == enumSingleton2));


    }

}
