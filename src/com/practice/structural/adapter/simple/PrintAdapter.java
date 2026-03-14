package com.practice.structural.adapter.simple;

public class PrintAdapter implements Printer {
    private LegacyPrinter legacyPrinter = new LegacyPrinter();

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}
