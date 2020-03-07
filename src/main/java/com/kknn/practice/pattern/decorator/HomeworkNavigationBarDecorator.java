package com.kknn.practice.pattern.decorator;

import java.util.List;

public class HomeworkNavigationBarDecorator extends AbstractNavigationBarDecorator {
    public HomeworkNavigationBarDecorator(AbstractNavigationBar navigationBar) {
        super(navigationBar);
    }

    private void addHomeworkBar() {
        super.getBar().add("作业");
    }

    @Override
    public List<String> getBar() {
        addHomeworkBar();

        return super.getBar();
    }

}
