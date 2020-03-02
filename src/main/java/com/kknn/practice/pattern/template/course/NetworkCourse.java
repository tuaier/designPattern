package com.kknn.practice.pattern.template.course;

/**
 * @author kangfw5
 * @since 2019-07-23
 */
public abstract class NetworkCourse {

    protected final void createCourse() {
        //1、发布预习质量
        this.postPreResource();
        //2、制作PPT
        this.createPPT();
        //3、直播
        this.liveVideo();
        //4、提交课件、笔记
        this.postNote();
        //5、提交源码
        this.postSource();
        //6、布置作业 有作业->检查作业 没有作业->完成
        if (needWork()) {
            checkHomework();
        }

    }

    abstract void checkHomework();

    /**
     * 钩子方法
     *
     * @return
     */
    protected boolean needWork() {
        return false;
    }

    final void postSource() {
        System.out.println("提交源码");
    }

    final void postNote() {
        System.out.println("提交课件、笔记");
    }

    final void liveVideo() {
        System.out.println("在线直播");
    }

    final void createPPT() {
        System.out.println("制作备课PPT");
    }

    final void postPreResource() {
        System.out.println("分发预习质量");
    }
}
