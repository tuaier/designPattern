package com.kknn.practice.pattern.singleton.lazy;

/**
 * 懒汉式单例
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton() {

    }

    /**
     * JDK1.6之后对synchronized的性能优化了很多
     * 但是不可避免的还是存在一定的性能问题，造成整个类被锁
     *
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
