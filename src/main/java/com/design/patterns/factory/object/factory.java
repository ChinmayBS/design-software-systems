package com.design.patterns.factory.object;

public class factory {
    public static Knife createKnife(String knifeType) {
        Knife knife = null;

        if ("chef".equals(knifeType)) {
            knife = new ChefKnife();
        }
        if ("steak".equals(knifeType)) {
            knife = new SteakKnife();
        }

        return knife;
    }
}
