package com.kknn.practice.pattern.factory.factorymethod;

import com.kknn.practice.pattern.factory.common.ICourse;
import com.kknn.practice.pattern.factory.common.PythonCourse;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
