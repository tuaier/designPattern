package com.kknn.practice.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @author kangfw5
 * @date 2019-06-26
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
