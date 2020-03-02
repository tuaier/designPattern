package com.kknn.practice.pattern.proxy.dynamicproxy.gpproxy;

import com.kknn.practice.pattern.proxy.Person;

import java.lang.reflect.Method;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class GPMeipo implements GPInvocationHandler {
    private Person target;

    public Object getInstance(Person person) {
        this.target = person;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
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
