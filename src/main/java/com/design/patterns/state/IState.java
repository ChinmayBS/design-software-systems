package com.design.patterns.state;

public interface IState {
    void insertDollar(VendingMachine vendingMachine);

    void ejectMoney(VendingMachine vendingMachine);

    void dispense(VendingMachine vendingMachine);
}
