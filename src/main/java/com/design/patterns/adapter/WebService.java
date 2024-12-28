package com.design.patterns.adapter;

public class WebService {
    private final String url;
    public WebService(String url) {
        this.url = url;
    }
    public Json request(Json json){
        System.out.println(url);
        return json;
    }
}
