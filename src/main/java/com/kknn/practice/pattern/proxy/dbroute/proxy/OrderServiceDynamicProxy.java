package com.kknn.practice.pattern.proxy.dbroute.proxy;

import com.kknn.practice.pattern.proxy.dbroute.db.DynamicDataSourceEntity;
import com.kknn.practice.pattern.proxy.dynamicproxy.gpproxy.GPClassLoader;
import com.kknn.practice.pattern.proxy.dynamicproxy.gpproxy.GPInvocationHandler;
import com.kknn.practice.pattern.proxy.dynamicproxy.gpproxy.GPProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class OrderServiceDynamicProxy implements GPInvocationHandler {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private Object proxyObj;

    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class clazz = proxyObj.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object result = method.invoke(this.proxyObj, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("执行后");
        DynamicDataSourceEntity.restore();
    }

    private void before(Object target) {
        try {
            System.out.println("执行前");
            Long createTime = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            int router = Integer.parseInt(sdf.format(new Date(createTime)));
            System.out.println("静态代理类自动分配到【DB_" + router + "】数据源处理");
            DynamicDataSourceEntity.set(router);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceDynamicProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int insertOrder(Order order) {
        Long createTime = order.getCreateTime();
        int router = Integer.parseInt(sdf.format(new Date(createTime)));
        System.out.println("静态代理类自动分配到【DB_" + router + "】数据源处理");
        DynamicDataSourceEntity.set(router);
        int result = this.orderService.insertOrder(order);
        DynamicDataSourceEntity.restore();
        return result;
    }*/
}
