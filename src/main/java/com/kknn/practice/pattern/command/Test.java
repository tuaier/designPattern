package com.kknn.practice.pattern.command;

import com.kknn.practice.pattern.command.cmd.HelpCommand;
import com.kknn.practice.pattern.command.cmd.ICommand;

import java.util.Scanner;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class Test {

    public static void main(String[] args) throws Exception {
        FtpClient client = new FtpClient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input ftp command:");
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            client.command(command);
            if ("exit".equals(command)) {
                System.exit(0);
            }
        }
    }
}
