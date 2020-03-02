package com.kknn.practice.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author kangfw5
 * @since 2019-06-28
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        //相当于proxy 代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = methodProxy.invokeSuper(o, objects);
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
