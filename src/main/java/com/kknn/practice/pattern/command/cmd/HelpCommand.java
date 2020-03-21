package com.kknn.practice.pattern.command.cmd;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Set;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class HelpCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "help";
    }

    @Override
    public void execute() {
        Reflections reflections = new Reflections(this.getClass().getPackage().getName());
        Set<Class<? extends ICommand>> subTypesOf = reflections.getSubTypesOf(ICommand.class);
        for (Class<? extends ICommand> clazz : subTypesOf) {
            ICommand command;
            try {
                command = clazz.newInstance();
                System.out.println(command.help());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String help() {
        return "help     :ftp help";
    }
}
