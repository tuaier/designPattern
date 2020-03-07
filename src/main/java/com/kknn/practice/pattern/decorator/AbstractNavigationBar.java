package com.kknn.practice.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNavigationBar {
    List<String> barList = new ArrayList<>();
    public abstract List<String> getBar();
}
