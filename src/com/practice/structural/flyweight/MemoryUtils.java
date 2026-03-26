package com.practice.structural.flyweight;

/**
 * Util class to print the memory usage
 */
public class MemoryUtils {
    public static long getMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        System.gc();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static void printMemoryUsage(String stage, long initialMemory) {
        long currentMemory = getMemoryUsage();
        double usedMB = (currentMemory - initialMemory) / (1024.0 * 1024.0);
        System.out.printf("[%s] Memory added to heap: %.2f MB%n", stage, usedMB);
    }
}
