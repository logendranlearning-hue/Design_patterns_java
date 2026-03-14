package com.practice.structural.adapter.simple;

public class Client {

    public static void clientCode(Printer printer) {
        printer.print();
    }
    public static void main(String[] args) {
        PrintAdapter printer = new PrintAdapter();
        clientCode(printer);
    }
}
