package com.design.patterns.facade;


public class Investment implements IAccount {
    private String accountNumber;
    private double balance;
    public Investment(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void transfer(IAccount account, double amount) {

    }
}
