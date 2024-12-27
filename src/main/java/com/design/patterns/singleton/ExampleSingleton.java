package com.design.patterns.singleton;

public class ExampleSingleton {
    private static ExampleSingleton instance;
    private ExampleSingleton() {}
    public static ExampleSingleton getInstance(){
        if(instance==null){
            instance=new ExampleSingleton();
        }
        return instance;
    }
}
