package com.kknn.practice.pattern.singleton.serialize;

import java.io.Serializable;

/**
 * @author kangfw5
 * @since 2019-05-28
 */
public class SerializeSingleton implements Serializable {

    private static final SerializeSingleton HUNGRY_SINGLETON = new SerializeSingleton();

    private SerializeSingleton() {

    }

    public static SerializeSingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    /**
     * readResolve知识覆盖了反序列化的出来的对象
     * 还是创建了两次，只不过是发生在JVM层面，相对来说比较安全，之前反序列化会被GC回收
     *
     * @return Object
     */
    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }
}
