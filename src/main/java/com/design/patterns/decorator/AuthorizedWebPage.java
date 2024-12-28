package com.design.patterns.decorator;

public class AuthorizedWebPage extends WebPageDecorator implements WebPage {
    private  WebPage webPage;
    public AuthorizedWebPage(WebPage webPage) {
        super(webPage);
        this.webPage=webPage;
    }

    @Override
    public void display() {
        webPage.display();
        System.out.println("Authorized Web Page");
    }
}
