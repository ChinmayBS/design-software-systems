package com.design.patterns.chain.of.responsibility;

public class Main {
    public static void main(String[] args) {
        FilterHandler filterHandler1=new Level1FilterHandler();
        FilterHandler filterHandler2=new Level2FilterHandler();
        filterHandler1.setNext(filterHandler2);
        FilterHandler filterHandler3=new Level3FilterHandler();
        filterHandler2.setNext(filterHandler3);

        filterHandler1.handleRequest("level1");
        filterHandler1.handleRequest("level2");
        filterHandler1.handleRequest("level3");

    }
}
