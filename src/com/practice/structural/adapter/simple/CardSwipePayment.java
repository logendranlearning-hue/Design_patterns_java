package com.practice.structural.adapter.simple;

/**
 * This is the existing card swipe payment system which is being used by the client code.
 */
public class CardSwipePayment implements PaymentProcessor{
    @Override
    public void processAmount(double amount) {
        System.out.println("Card Swipe Payment : "+amount);
    }
}
