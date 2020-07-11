package com.kknn.practice.pattern.strategy.homework;

import com.kknn.practice.pattern.strategy.pay.payport.Payment;

import java.util.HashMap;
import java.util.Map;

public class StayCityMode {
    public static final String DOMESTIC_MODE = "DOMESTIC";
    public static final String NO_LIMIT_MODE = "NO_LIMIT";
    public static final String ALL_LIMIT_MODE = "ALL_LIMIT";
    public static final String DEFAULT_MODE = "NO";

    private static Map<String, IStayStrategy> stayCityMode = new HashMap<>();

    static {
        stayCityMode.put(DOMESTIC_MODE, new DomesticStayStrategy());
        stayCityMode.put(NO_LIMIT_MODE, new NoLimitStayStrategy());
        stayCityMode.put(ALL_LIMIT_MODE, new NoLimitStayStrategy());
        stayCityMode.put(DEFAULT_MODE, new NoLimitStayStrategy());
    }

    public static IStayStrategy get(String mode) {
        if (!stayCityMode.containsKey(mode)) {
            return stayCityMode.get(DEFAULT_MODE);
        }
        return stayCityMode.get(mode);
    }
}
