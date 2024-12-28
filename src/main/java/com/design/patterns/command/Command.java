package com.design.patterns.command;

public interface Command {
    void execute();
    void unExecute();
    boolean isReversible();

}
