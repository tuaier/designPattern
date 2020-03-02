package com.kknn.practice.pattern.template.course;

/**
 * @author kangfw5
 * @since 2019-07-23
 */
public class BigDataCourse extends NetworkCourse {
    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected boolean needWork() {
        return needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }
}
