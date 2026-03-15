package com.practice.structural.adapter;

/**
 * This is the target interface which is used by the client code and we need to adapt the new advanced payment system to this interface
 */
public interface PaymentProcessor {
    void processAmount(double amount);
}
