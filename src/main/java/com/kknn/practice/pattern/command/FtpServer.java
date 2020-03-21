package com.kknn.practice.pattern.command;
import java.util.*;

import com.kknn.practice.pattern.command.cmd.ICommand;
import org.reflections.Reflections;

/**
 * @author kangfw5
 * @since 2020-03-18
 */
public class FtpServer {
    private List<ICommand> commandList = new ArrayList<>();
    /**
     * 约定：实现ICommand接口并且和他相同包下的类都认为是一种命令
     *
     * 因此如果要拓展新的命令只要满足约定就可以支持无线拓展
     */
    private static HashMap<String, ICommand> commandMap = new HashMap<>();
    static {
        Reflections reflections = new Reflections(ICommand.class.getPackage().getName());
        Set<Class<? extends ICommand>> subTypesOf = reflections.getSubTypesOf(ICommand.class);
        for (Class<? extends ICommand> clazz : subTypesOf) {
            ICommand command;
            try {
                command = clazz.newInstance();
                commandMap.put(command.getCommandName(), command);
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public void addCommand(String command) {
        if (commandMap.containsKey(command)) {
            commandList.add(commandMap.get(command));
        } else {
            System.out.println("not supported command, input 'help' to get commands supported");
        }
    }

    public void execute() {
        Iterator<ICommand> iterator = commandList.iterator();
        while (iterator.hasNext()) {
            try {
                iterator.next().execute();
                iterator.remove();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
