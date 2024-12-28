package com.design.patterns.composite;

import java.awt.*;
import java.util.List;

public class Housing implements IStructure {
    private String address;
    private List<IStructure> structures;
    public Housing(String address) {
        this.address = address;
    }

    public IStructure getStructure(int id){
        return structures.get(id);
    }

    public int addStructure(IStructure  structure){
        structures.add(structure);
        return structures.size()-1;
    }

    @Override
    public void entry() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void location() {
      System.out.println("Housing address " + address);
    }

    @Override
    public void getName() {

    }
}
