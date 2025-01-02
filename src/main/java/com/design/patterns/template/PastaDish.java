package com.design.patterns.template;

public abstract class PastaDish {
    public final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        addProtein();
        addGarnish();
        addSauce();
        drainAndPlate();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void cookPasta() {
        System.out.println("Cooking pasta");
    }

    private void drainAndPlate() {
        System.out.println("Plate the pasta");
    }

    protected abstract void addPasta();

    protected abstract void addSauce();

    protected abstract void addProtein();

    protected abstract void addGarnish();
}
