package com.kknn.practice.pattern.singleton.lazy;

/**
 * 静态内部类懒汉式单例模式
 * 1、没有用到synchronized关键字，性能最优的一种写法
 * 2、LazyHolder里的逻辑需要等到外部方法调用时才执行，巧妙的运用了内部类的特性
 * 3、JVM底层逻辑，巧妙的避免了线程安全问题
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        // 虽然构造方法私有化了，但是反射仍旧可以访问
        // 防止反射攻击
        if (LazyHolder.LAZY_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }

}
