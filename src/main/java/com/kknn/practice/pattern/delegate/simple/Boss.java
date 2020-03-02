package com.kknn.practice.pattern.delegate.simple;

/**
 * @author kangfw5
 * @since 2019-06-29
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
