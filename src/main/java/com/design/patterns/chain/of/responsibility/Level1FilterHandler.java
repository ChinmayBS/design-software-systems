package com.design.patterns.chain.of.responsibility;

public class Level1FilterHandler extends FilterHandler {

    public Level1FilterHandler(){
        super("level1");
    }
    @Override
    public void handleRequest(String level) {
        if(level.equals(getCurrentLevel())){
            System.out.println("Level 1 support");
        }else{
            getFilterHandler().handleRequest(level);
        }
    }

    @Override
    public void setNext(FilterHandler filterHandler) {
        setFilterHandler(filterHandler);
    }
}
