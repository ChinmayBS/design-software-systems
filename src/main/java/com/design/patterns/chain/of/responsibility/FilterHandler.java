package com.design.patterns.chain.of.responsibility;

public abstract class FilterHandler {
    private FilterHandler filterHandler;

    public FilterHandler getFilterHandler() {
        return filterHandler;
    }

    public void setFilterHandler(FilterHandler filterHandler) {
        this.filterHandler = filterHandler;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    private String currentLevel;

    public FilterHandler(String currentLevel){
        this.currentLevel=currentLevel;
    }
    public abstract void handleRequest(String level);
    public abstract void setNext(FilterHandler filterHandler);
}
