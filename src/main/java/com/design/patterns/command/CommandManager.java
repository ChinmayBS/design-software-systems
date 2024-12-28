package com.design.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private static CommandManager instance =null;
    private List<Command> commands;
    private CommandManager(){
        commands = new ArrayList<>();
    }
    public static CommandManager getInstance(){
        if(instance == null){
            instance = new CommandManager();
        }
        return instance;
    }

    public void invokeCommand(Command command){
        command.execute();
    }
}
