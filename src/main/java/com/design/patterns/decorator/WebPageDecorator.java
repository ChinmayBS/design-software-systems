package com.design.patterns.decorator;

public abstract class WebPageDecorator implements WebPage {
    protected  WebPage webPage;

    public WebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }
    @Override
    public void display() {
        webPage.display();
    }
}
