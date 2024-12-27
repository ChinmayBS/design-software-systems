package com.design.patterns.facade;

public class Saving implements IAccount {

    private String accountNumber;

    private double balance;

    public Saving(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void transfer(IAccount account, double amount) {

    }

}
