package com.design.patterns.command;

public class PasteCommand implements Command {
    private Document document;
    private String text;
    private int position;

    public PasteCommand(Document document, String text, int position) {
        this.document = document; //a receiver
        this.text = text;
        this.position = position;
    }
    @Override
    public void execute() {
            document.insertText(this.text, position);
    }

    @Override
    public void unExecute() {
        document.deleteText(position,text.length());
    }

    @Override
    public boolean isReversible() {
        return true;
    }
}
