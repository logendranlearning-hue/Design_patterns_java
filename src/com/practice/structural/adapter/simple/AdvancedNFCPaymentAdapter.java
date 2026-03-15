package com.practice.structural.adapter.simple;

public class AdvancedNFCPaymentAdapter implements PaymentProcessor {
    private AdvancedNFPayment advancedNFPayment;

    public AdvancedNFCPaymentAdapter(AdvancedNFPayment advancedNFPayment) {
        this.advancedNFPayment = advancedNFPayment;
    }

    @Override
    public void processAmount(double amount) {
        // Adapting the new advanced payment system to the existing payment processor interface
        advancedNFPayment.executeNFC(amount);
    }
}
