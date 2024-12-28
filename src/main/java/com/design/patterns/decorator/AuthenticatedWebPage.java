package com.design.patterns.decorator;

public class AuthenticatedWebPage extends WebPageDecorator implements WebPage {
    WebPage webPage;
    public AuthenticatedWebPage(WebPage webPage) {
        super(webPage);
        this.webPage = webPage;
    }

    @Override
    public void display() {
        webPage.display();
        System.out.println("Authenticated Web Page");
    }
}
