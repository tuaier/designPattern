package com.kknn.practice.pattern.decorator;

import java.util.List;

public class ConcreteNavigationBar extends AbstractNavigationBar {


    public ConcreteNavigationBar() {
        this.barList.add("问答");
        this.barList.add("文章");
        this.barList.add("精品课");
        this.barList.add("冒泡");
        this.barList.add("商城");
    }

    @Override
    public List<String> getBar() {

        return barList;
    }
}
