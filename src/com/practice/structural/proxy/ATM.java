package com.practice.structural.proxy;

/**
 * It demonstrates the Proxy design pattern by simulating an ATM that interacts with a bank account.
 * The ATM class contains a main method that creates a ProxyBankAccount with an initial balance and performs various operations such as withdrawing money and authenticating the user.
 * The ProxyBankAccount class acts as a proxy to the RealBankAccount class, adding an authentication layer before allowing access to the withdrawal functionality.
 * The RealBankAccount class contains the actual implementation of the withdrawal operation, while the ProxyBankAccount class controls access to it based on the authentication status of the user.
 * This example illustrates how the Proxy design pattern can be used to add additional functionality (authentication) to an existing class (RealBankAccount) without modifying its code, by introducing a proxy class (ProxyBankAccount) that controls access to the real subject class (RealBankAccount).
 */
public class ATM {
    static void main() {
        ProxyBankAccount account = new ProxyBankAccount(5000); // initial account balance

        account.withdraw(1000); // Attempt to withdraw without authentication
        account.authenticate("1234Password"); // wrong password attempt
        account.authenticate("password123"); // correct password attempt
        account.withdraw(8000); // Attempt to withdraw more than the balance
        account.withdraw(1000); // successful withdrawal

    }
}
