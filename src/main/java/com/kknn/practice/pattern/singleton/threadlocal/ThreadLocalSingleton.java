package com.kknn.practice.pattern.singleton.threadlocal;

/**
 * 伪线程安全，线程内安全，线程间不安全
 *
 * @author kangfw5
 * @since 2019-05-28
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {

    }

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }
}
