package com.kknn.practice.pattern.factory.factorymethod;

import com.kknn.practice.pattern.factory.common.ICourse;
import com.kknn.practice.pattern.factory.common.JavaCourse;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
