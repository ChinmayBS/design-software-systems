package com.design.patterns.state;

public class OutOfStockState implements IState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        vendingMachine.doReturnMoney();
        System.out.println("Out of stock");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Insert dollar");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of stock");
    }
}
