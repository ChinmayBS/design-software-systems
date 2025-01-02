package com.design.patterns.observer;

public class Subscriber implements Observer{
    @Override
    public void update() {
        System.out.println("New blog is out.....");
    }
}
