package com.kknn.practice.pattern.proxy.dynamicproxy.jdkproxy;

import com.kknn.practice.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class Meipo implements InvocationHandler {
    private Object target;

    public Object getInstance(Object obj) {
        this.target = obj;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("媒婆根据需求进行筛选对象");
    }

    private void after() {
        System.out.println("相亲成功就收钱");
    }
}
