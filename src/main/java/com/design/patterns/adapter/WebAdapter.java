package com.design.patterns.adapter;

public class WebAdapter implements WebRequester{
    private WebService webService;
    public void  connect(WebService webService){
        this.webService = webService;
    }

    @Override
    public int request(Object request) {
        Json jsonRequest=toJson(request);
        Json response= webService.request(jsonRequest);
        if(response==null){
            return 400;
        }
        return 200;
    }

    private Json toJson(Object request) {
        System.out.println(request);
        return new Json();
    }
}
