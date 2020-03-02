package com.kknn.practice.pattern.delegate.simple;

/**
 * @author kangfw5
 * @since 2019-06-29
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("员工A开始干活了，擅长加密，执行" + command);
    }
}
