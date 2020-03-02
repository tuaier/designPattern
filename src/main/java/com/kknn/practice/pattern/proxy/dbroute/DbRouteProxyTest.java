package com.kknn.practice.pattern.proxy.dbroute;

import com.kknn.practice.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(System.currentTimeMillis());

        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());

        int i = orderService.insertOrder(order);
        System.out.println(i);
    }
}
