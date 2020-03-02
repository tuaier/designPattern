package com.kknn.practice.pattern.factory.common;

/**
 * @author kangfw5
 * @since 2019-05-17
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("record java course");
    }
}
