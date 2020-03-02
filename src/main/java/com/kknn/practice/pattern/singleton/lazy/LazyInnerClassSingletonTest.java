package com.kknn.practice.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 静态内部类单例测试
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            // 不走寻常路，破坏了单例模式
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor();

            constructor.setAccessible(true);
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
