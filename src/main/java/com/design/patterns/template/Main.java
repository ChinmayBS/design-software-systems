package com.design.patterns.template;

public class Main {
    public static void main(String[] args) {
        PastaDish spagetti=new SpagettiMeatBalls();
        PastaDish alfredo=new PenneAlfredo();
        spagetti.makeRecipe();
        alfredo.makeRecipe();
    }
}
