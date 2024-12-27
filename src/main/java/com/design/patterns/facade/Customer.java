package com.design.patterns.facade;

public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        String savingAccount=bankService.createAccount("saving",100.0);
        String investmentAccount =bankService.createAccount("investment",100.0);
        bankService.transfer(savingAccount,investmentAccount,10);
    }
}
