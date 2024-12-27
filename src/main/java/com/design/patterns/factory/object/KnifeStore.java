package com.design.patterns.factory.object;

public class KnifeStore {
    Knife getKnife(String knifeType){
        Knife knife=factory.createKnife(knifeType);
        knife.sharpen();
        knife.polish();
        knife.package_();
        return knife;
    }
}
