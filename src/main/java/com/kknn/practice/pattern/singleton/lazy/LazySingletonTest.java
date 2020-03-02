package com.kknn.practice.pattern.singleton.lazy;

/**
 * @author kangfw5
 * @since 2019-05-28
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
