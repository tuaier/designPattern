package com.kknn.practice.pattern.command.cmd;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class UpdateCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "update";
    }

    @Override
    public void execute() {
        System.out.println("ftp update...");
        for (int i = 0; i < 5; i++) {
            System.out.println("ftp updating process: " + (i + 1)*20 + "%");
        }
    }

    @Override
    public String help() {
        return "update   :ftp update";
    }
}
