package com.design.patterns.command;

public class Main {
    public static void main(String[] args) {
        CommandManager commandManager=CommandManager.getInstance();
        commandManager.invokeCommand(new PasteCommand(new Document(),"Some text",0));
    }
}
