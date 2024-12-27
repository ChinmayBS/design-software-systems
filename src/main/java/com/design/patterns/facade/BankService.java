package com.design.patterns.facade;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankService {
    Map<String, IAccount> accounts;

    public BankService() {
        accounts = new HashMap<>();
    }

    String createAccount(String accountType,double amount) {
        String accountNumber = UUID.randomUUID().toString();
        switch (accountType) {
            case "saving":
                IAccount account = new Saving(accountNumber,amount);
                accounts.put(accountNumber, account);
                return accountNumber;
            case "chequing":
                IAccount chequingAccount = new Chequing(accountNumber,amount);
                accounts.put(accountNumber, chequingAccount);
                return accountNumber;
            case "investment":
                IAccount investmentAccount = new Investment(accountNumber,amount);
                accounts.put(accountNumber, investmentAccount);
                return accountNumber;
        }
        return null;
    }

    void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        IAccount fromAccount = accounts.get(fromAccountNumber);
        IAccount toAccount = accounts.get(toAccountNumber);
        if (fromAccount == null || toAccount == null) {
            return;
        }
        fromAccount.transfer(toAccount,amount);
    }
}
