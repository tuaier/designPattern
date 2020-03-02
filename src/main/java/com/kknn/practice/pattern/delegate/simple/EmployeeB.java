package com.kknn.practice.pattern.delegate.simple;

/**
 * @author kangfw5
 * @since 2019-06-29
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("员工B开始干活了，擅长架构，执行" + command);
    }
}
