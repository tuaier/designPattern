package com.kknn.practice.pattern.factory.abstractfactory;

import com.kknn.practice.pattern.factory.common.*;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
