package com.kknn.practice.pattern.strategy.homework;

import com.kknn.practice.pattern.strategy.homework.service.CityService;

import java.util.List;

public class DomesticStayStrategy implements IStayStrategy {
    @Override
    public List<String> getStayCity(List<String> cityList) {
        List<String> domesticCityList = CityService.getDomesticCity();
        cityList.removeIf(city -> !domesticCityList.contains(city));
        return cityList;
    }
}
