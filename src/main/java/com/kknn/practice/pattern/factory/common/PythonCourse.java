package com.kknn.practice.pattern.factory.common;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("record python course");
    }
}
