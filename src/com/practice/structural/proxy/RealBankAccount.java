package com.practice.structural.proxy;

/**
 * This is the real subject class that implements the BankAccount interface.
 * It has a balance and a withdraw method that checks if the balance is sufficient before allowing the withdrawal.
 * This class is used by the proxy to perform the actual withdrawal operation.
 */
public class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance in account : " + balance);
        }
    }

}
