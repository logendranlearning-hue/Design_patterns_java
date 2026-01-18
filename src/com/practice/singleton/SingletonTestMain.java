package com.practice.singleton;

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
