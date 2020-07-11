package com.kknn.practice.pattern.strategy.homework.service;

import java.util.Arrays;
import java.util.List;
// 暂时写死
public class CityService {
    private static final List<String> DOMESTIC_CITY = Arrays.asList("北京", "上海", "深圳");
    private static final List<String> FOREIGN_CITY = Arrays.asList("纽约", "巴黎", "东京");
    private static final List<String> ALL_CITY = Arrays.asList("北京", "上海", "深圳", "纽约", "巴黎", "东京");

    public static List<String> getDomesticCity() {
        return DOMESTIC_CITY;
    }

    public static List<String> getForeignCity() {
        return FOREIGN_CITY;
    }

    public static List<String> getAllCity() {
        return ALL_CITY;
    }
}
