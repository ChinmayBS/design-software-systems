package com.design.patterns.factory.method;

public abstract class KnifeStore {
    public Knife getKnife(String knifeType){
        Knife knife= createKnife(knifeType);
        knife.sharpen();
        knife.polish();
        knife.package_();
        return knife;
    }
    public abstract Knife createKnife(String knifeType);
}
