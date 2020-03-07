package com.kknn.practice.pattern.decorator;

public class TestBar {
    public static void main(String[] args) {
        AbstractNavigationBar bar = new ConcreteNavigationBar();
        System.out.println("初始未装饰：" + bar.getBar());
        bar = new HomeworkNavigationBarDecorator(bar);
        System.out.println("第一次装饰：" + bar.getBar());
        bar = new QuestionNavigationBarDecorator(bar);
        System.out.println("第二次装饰：" + bar.getBar());
    }
}
