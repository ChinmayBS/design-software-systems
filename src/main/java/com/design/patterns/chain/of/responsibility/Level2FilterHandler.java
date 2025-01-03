package com.design.patterns.chain.of.responsibility;

public class Level2FilterHandler extends FilterHandler {

    public Level2FilterHandler(){
        super("level2");
    }

    @Override
    public void handleRequest(String level) {
        if(level.equals(getCurrentLevel())){
            System.out.println("Handle request at level 2");
        }else {
            getFilterHandler().handleRequest(level);
        }
    }

    @Override
    public void setNext(FilterHandler filterHandler) {
        setFilterHandler(filterHandler);
    }
}
