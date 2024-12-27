package com.design.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        ExampleSingleton instance=ExampleSingleton.getInstance();
        System.out.println(instance);
        ExampleSingleton instance2=ExampleSingleton.getInstance();
        System.out.println(instance2);
    }
}
