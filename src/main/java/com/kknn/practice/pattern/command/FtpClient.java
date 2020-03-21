package com.kknn.practice.pattern.command;

import org.apache.commons.lang3.StringUtils;

/**
 * @author kangfw5
 * @since 2020-03-18
 */
public class FtpClient {
    private static FtpServer ftpServer = new FtpServer();

    public void command(String command){
        if(StringUtils.isEmpty(command)){
            System.out.println("please input command");
            return;
        }
        ftpServer.addCommand(command);
        ftpServer.execute();
    }
}
