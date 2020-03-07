package com.kknn.practice.pattern.decorator;

import java.util.List;

public class QuestionNavigationBarDecorator extends AbstractNavigationBarDecorator {
    public QuestionNavigationBarDecorator(AbstractNavigationBar navigationBar) {
        super(navigationBar);
    }

    private void addQuestionBankBar() {
        super.barList.add("题库");
    }

    @Override
    public List<String> getBar() {
        addQuestionBankBar();
        return super.getBar();
    }
}
