package com.kknn.practice.pattern.proxy.dbroute.db;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class DynamicDataSourceEntity {
    private static final String DEFAULT_SOURCE = null;
    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntity() {
    }

    private static String get() {
        return local.get();
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

    /**
     * DB 2018
     * DB_2019
     */
    public static void set(String source) {
        local.set(source);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }
}
