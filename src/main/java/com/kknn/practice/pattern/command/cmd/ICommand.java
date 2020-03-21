package com.kknn.practice.pattern.command.cmd;

/**
 * @author kangfw5
 * @since 2020-03-18
 */
public interface ICommand {
    /**
     * 获取命令名
     */
    String getCommandName();

    /**
     * 执行命令
     */
    void execute();

    /**
     * 帮助文档
     */
    String help();
}
