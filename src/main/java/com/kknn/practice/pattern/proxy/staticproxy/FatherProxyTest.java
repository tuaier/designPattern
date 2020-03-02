package com.kknn.practice.pattern.proxy.staticproxy;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
