package com.kknn.practice.pattern.singleton.hungry;

/**
 * 饿汉式单例
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("HUNGRY_SINGLETON new");
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    public static void test() {
        System.out.println("HUNGRY_SINGLETON ");
    }
}
