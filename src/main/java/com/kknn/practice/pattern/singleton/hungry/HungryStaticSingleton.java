package com.kknn.practice.pattern.singleton.hungry;

/**
 * 饿汉式单例变种
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton HUNGRY_STATIC_SINGLETON;

    static {
        System.out.println("HUNGRY_STATIC_SINGLETON init");
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
        System.out.println("HUNGRY_STATIC_SINGLETON new");
    }

    public static HungryStaticSingleton getInstance() {
        return HUNGRY_STATIC_SINGLETON;
    }

    public static void test() {
        System.out.println("HUNGRY_STATIC_SINGLETON test");
    }

}
