package com.design.patterns.decorator;

public class BasicWebPage  implements WebPage {
    private String html;
    private String css;
    private String js;
    public BasicWebPage(String html, String css, String js) {
        this.html = html;
        this.css = css;
        this.js = js;
    }
    @Override
    public void display() {
        System.out.println("Creating basic web page");
        System.out.println(html);
        System.out.println(css);
        System.out.println(js);
        System.out.println(".........");
    }
}
