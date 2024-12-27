package com.design.patterns.factory.method;

public class BudgetKnifeStore extends KnifeStore{
    @Override
    public Knife createKnife(String knifeType) {
        if(knifeType.equals("chef")){
            return new BudgetChefKnife();
        }
        if(knifeType.equals("steak")){
            return new BudgetSteakKnife();
        }
        return null;
    }
}
