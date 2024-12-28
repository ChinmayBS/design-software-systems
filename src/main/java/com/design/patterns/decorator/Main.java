package com.design.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        WebPage basicWebPage=new BasicWebPage("Some html","CSS","JS script");
        WebPage authenticatedPage=new AuthenticatedWebPage(basicWebPage);
        WebPage authorizedPage=new AuthorizedWebPage(authenticatedPage);

        authorizedPage.display();
    }
}
