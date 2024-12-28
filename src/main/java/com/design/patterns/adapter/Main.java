package com.design.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        String url="www.google.com";
        WebService webService = new WebService(url);
        WebAdapter webAdapter=new WebAdapter();
        webAdapter.connect(webService);
        WebClient webClient=new WebClient(webAdapter);
        webClient.doWork();
    }
}
