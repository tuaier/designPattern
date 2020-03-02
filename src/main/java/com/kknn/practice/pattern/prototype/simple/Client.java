package com.kknn.practice.pattern.prototype.simple;

/**
 * 原型模式客户端
 *
 * @author kangfw5
 * @since 2019-05-29
 */
public class Client {
    /*private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }*/

    public Prototype startClone(Prototype concretePrototype) {
        return concretePrototype.clone();
    }
}
