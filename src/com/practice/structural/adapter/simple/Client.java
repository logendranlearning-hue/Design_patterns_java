package com.practice.structural.adapter.simple;

/**
 * Execution class which demonstrates the use of adapter pattern to integrate a new advanced payment system into the existing payment process without changing the client code.
 */
public class Client {
    public static void main(String[] args) {
        // old payment process
        PaymentProcessor cardPaymentProcessor = new CardSwipePayment();
        cardPaymentProcessor.processAmount(500);
        PaymentProcessor tapAndPayPaymentProcessor = new TapAndPayPayment();
        tapAndPayPaymentProcessor.processAmount(800);

        // same process amount method but with new advanced payment system using adapter
        AdvancedNFPayment advancedNFPayment = new AdvancedNFPayment();
        PaymentProcessor advancedNFCPaymentProcessor = new AdvancedNFCPaymentAdapter(advancedNFPayment);
        advancedNFCPaymentProcessor.processAmount(1000);

    }
}
