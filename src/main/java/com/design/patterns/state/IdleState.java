package com.design.patterns.state;

public class IdleState implements IState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("one Dollar inserted");
        vendingMachine.setCurrentState(vendingMachine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Insert money to dispense");
    }
}
