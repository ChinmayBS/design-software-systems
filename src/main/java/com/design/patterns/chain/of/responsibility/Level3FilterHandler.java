package com.design.patterns.chain.of.responsibility;

public class Level3FilterHandler extends FilterHandler {

    public Level3FilterHandler(){
        super("level3");
    }

    @Override
    public void handleRequest(String level) {
        if(level.equals(getCurrentLevel())){
            System.out.println("Handle request at level 3");
        }else {
            getFilterHandler().handleRequest(level);
        }
    }

    @Override
    public void setNext(FilterHandler filterHandler) {
      setFilterHandler(filterHandler);
    }
}
