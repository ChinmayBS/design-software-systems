package com.design.patterns.template;

public class SpagettiMeatBalls extends PastaDish{

    @Override
    protected void addPasta() {
        System.out.println("Adding spagetti");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding spagetti sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Adding veg protein");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding garnish");
    }
}
