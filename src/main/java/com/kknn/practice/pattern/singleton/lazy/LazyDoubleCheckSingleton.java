package com.kknn.practice.pattern.singleton.lazy;

/**
 * 双重检查锁的懒汉模式
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class LazyDoubleCheckSingleton {

    /**
     * CPU执行时会将程序转换为JVM指令
     * volatile解决指令重排序的问题
     * 1、分配内存给对象
     * 2、初始化对象
     * 3、将初始化好的对象和内存建立关系
     * 4、用户初次访问
     */
    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
