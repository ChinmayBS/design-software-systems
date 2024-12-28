package com.design.patterns.composite;


public class Room implements IStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void entry() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void location() {
    }

    @Override
    public void getName() {
        System.out.println("Name of the current building"+this.name);
    }
}
