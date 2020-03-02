package com.kknn.practice.pattern.delegate.simple;

/**
 * @author kangfw5
 * @since 2019-06-29
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("架构", new Leader());
    }
}
