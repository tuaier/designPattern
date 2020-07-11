package com.kknn.practice.pattern.strategy.homework;

import com.kknn.practice.pattern.strategy.homework.service.CityService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoLimitStayStrategy implements IStayStrategy {
    @Override
    public List<String> getStayCity(List<String> cityList) {
        return CityService.getAllCity();
    }
}
