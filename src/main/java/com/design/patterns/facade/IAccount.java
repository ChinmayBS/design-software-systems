package com.design.patterns.facade;

public interface IAccount {
    void transfer(IAccount account, double amount);
}
