package com.kknn.practice.pattern.template.course;

import com.kknn.practice.pattern.factory.common.JavaCourse;

/**
 * @author kangfw5
 * @since 2019-07-23
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("JAVA架构师");
        NetworkCourse javaCourse = new JavaNetworkCourse();
        javaCourse.createCourse();
        System.out.println();
        System.out.println("大数据课程");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
