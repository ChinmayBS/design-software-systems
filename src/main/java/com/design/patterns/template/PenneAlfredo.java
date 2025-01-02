package com.design.patterns.template;

public class PenneAlfredo extends PastaDish{
    @Override
    protected void addPasta() {
        System.out.println("Adding penne ");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding fish sauce ");

    }

    @Override
    protected void addProtein() {
        System.out.println("Adding meat balls");

    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding chopped meat");
    }
}
