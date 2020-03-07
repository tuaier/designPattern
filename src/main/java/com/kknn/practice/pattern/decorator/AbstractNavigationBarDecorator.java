package com.kknn.practice.pattern.decorator;

import java.util.List;

public class AbstractNavigationBarDecorator extends AbstractNavigationBar {
    private AbstractNavigationBar navigationBar = null;

    public AbstractNavigationBarDecorator(AbstractNavigationBar navigationBar) {
        this.navigationBar = navigationBar;
    }


    @Override
    public List<String> getBar() {
        return this.navigationBar.getBar();
    }
}
