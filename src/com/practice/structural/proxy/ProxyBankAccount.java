package com.practice.structural.proxy;

/**
 * This is proxy class which implements the BankAccount interface and has a reference to the RealBankAccount class.
 * It has an authenticate method to check if the user is authenticated before allowing the withdrawal operation.
 * The withdrawal method checks if the user is authenticated before calling the withdrawal method of the RealBankAccount class.
 * If the user is not authenticated, it will print a message asking the user to authenticate before withdrawing.
 * This class is used to control access to the RealBankAccount class and add an authentication layer to it.
 */
public class ProxyBankAccount implements BankAccount{
    private boolean isAuthenticated;
    private RealBankAccount realBankAccount;

    public ProxyBankAccount(double initialBalance) {
        realBankAccount = new RealBankAccount(initialBalance);
    }

    public void authenticate(String password) {
        if("password123".equals(password)){
            isAuthenticated = true;
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed. Incorrect password.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(isAuthenticated){
            realBankAccount.withdraw(amount);
        }  else {
            System.out.println("Please authenticate before withdraw.");
        }
    }
}
