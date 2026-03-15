package com.practice.structural.adapter.simple;

/**
 * This is the existing card Tap and Pay payment system which is being used by the client code.
 */
public class TapAndPayPayment implements PaymentProcessor {
    @Override
    public void processAmount(double amount) {
        System.out.println("Tap and Pay Payment : "+amount);
    }
}
