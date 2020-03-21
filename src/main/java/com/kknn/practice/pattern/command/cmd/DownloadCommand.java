package com.kknn.practice.pattern.command.cmd;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class DownloadCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "download";
    }

    @Override
    public void execute() {
        System.out.println("ftp downloading...");
        for (int i = 0; i < 5; i++) {
            System.out.println("ftp downloading process: " + (i + 1)*20 + "%");
        }
    }

    @Override
    public String help() {
        return "download :ftp download";
    }
}
