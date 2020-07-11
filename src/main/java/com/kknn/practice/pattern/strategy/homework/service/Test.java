package com.kknn.practice.pattern.strategy.homework.service;

import com.kknn.practice.pattern.strategy.homework.StayCityMode;
import com.kknn.practice.pattern.strategy.homework.TravelApplyOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("北京", "纽约"));

        TravelApplyOrder applyOrder = new TravelApplyOrder("0001", "APPLY202003140001", cities);
        List<String> allowCity = applyOrder.getAllowCity(StayCityMode.DOMESTIC_MODE);
        System.out.println("DOMESTIC_MODE:" + allowCity.toString());

    }
}
