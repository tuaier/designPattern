package com.kknn.practice.pattern.command.cmd;

/**
 * @author kangfw5
 * @since 2020-03-18
 */
public class ExitCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "exit";
    }

    @Override
    public void execute() {
        System.out.println("ftp exit...");
    }

    @Override
    public String help() {
        return "exit     :ftp exit";
    }
}
