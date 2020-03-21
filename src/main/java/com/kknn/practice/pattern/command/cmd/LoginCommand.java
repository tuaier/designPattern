package com.kknn.practice.pattern.command.cmd;

/**
 * @author kangfw5
 * @since 2020-03-18
 */
public class LoginCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "login";
    }

    @Override
    public void execute() {
        System.out.println("ftp login...");
    }

    @Override
    public String help() {
        return "login    :ftp login";
    }
}
