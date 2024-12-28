package com.design.patterns.adapter;

public class WebClient {
    WebRequester webRequester;

    public WebClient(WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    public void doWork() {
        Object obj = new Object();
        int status = webRequester.request(obj);
        if (status == 200) {
            System.out.println("Success");
        }
        System.out.println("Fail");
    }
}
