package com.design.patterns.factory.method;

public class QualityKnifeStore extends KnifeStore{
    @Override
    public Knife createKnife(String knifeType) {
        if(knifeType.equals("chef")){
            return new QualityChefKnife();
        }
        if(knifeType.equals("steak")){
            return new BudgetSteakKnife();
        }
        return null;
    }
}
