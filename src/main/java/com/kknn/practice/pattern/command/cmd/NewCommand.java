package com.kknn.practice.pattern.command.cmd;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class NewCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "new";
    }

    @Override
    public void execute() {
        System.out.println("尝试无线拓展命令是否可用");
    }

    @Override
    public String help() {
        return "new      :拓展命令示例";
    }
}
