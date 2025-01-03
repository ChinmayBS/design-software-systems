package com.design.patterns.state;

public class HasOneDollarStare implements IState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Money already inserted");
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Ejecting money now..");
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Dispensing your item...");
        vendingMachine.doReleaseProduct();
        if (vendingMachine.getCount() == 1) {
            vendingMachine.setCurrentState(vendingMachine.getOutOfStockState());
        } else {
            vendingMachine.setCurrentState(vendingMachine.getIdleState());
        }
        vendingMachine.setCount(vendingMachine.getCount() - 1);

    }
}
