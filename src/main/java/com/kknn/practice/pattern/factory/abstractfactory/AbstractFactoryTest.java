package com.kknn.practice.pattern.factory.abstractfactory;

import com.kknn.practice.pattern.factory.common.ICourse;
import com.kknn.practice.pattern.factory.common.INote;
import com.kknn.practice.pattern.factory.common.IVideo;

/**
 * @author kangfw5
 * @since 2019-05-18
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse javaCourse = factory.createCourse();
        INote javaNote = factory.createNote();
        IVideo javaVideo = factory.createVideo();
        javaCourse.record();
        javaNote.write();
        javaVideo.video();

        ICourseFactory pythonFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonFactory.createCourse();
        INote pythonNote = pythonFactory.createNote();
        IVideo pythodVideo = pythonFactory.createVideo();
        pythonCourse.record();
        pythonNote.write();
        pythodVideo.video();
    }
}
