package com.kknn.practice.pattern.strategy.homework;

import java.util.ArrayList;
import java.util.List;

public class AllLimitStayStrategy implements IStayStrategy {
    @Override
    public List<String> getStayCity(List<String> cityList) {
        return new ArrayList<>();
    }
}
