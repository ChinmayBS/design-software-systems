package com.design.patterns.state;

//events=>  insertDollar,ejectMoney,dispense
//actions=> doReleaseProduct,doReleaseDollar
public class VendingMachine {
    private IState idleState = new IdleState();
    private IState hasOneDollarState = new HasOneDollarStare();

    private int count;

    public VendingMachine(int count) {
        this.count = count;
        if (count == 0) {
            currentState = this.outOfStockState;
        } else {
            currentState = this.idleState;
        }
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void doReturnMoney() {
        System.out.println("Money returned");
    }

    public void doReleaseProduct() {
        System.out.println("Pick the product");
    }

    public IState getIdleState() {
        return idleState;
    }


    public IState getHasOneDollarState() {
        return hasOneDollarState;
    }


    public IState getOutOfStockState() {
        return outOfStockState;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private IState outOfStockState = new OutOfStockState();
    private IState currentState;

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }
}
