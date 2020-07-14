package com.kknn.practice.pattern.state.order;

import java.util.Map;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public interface IOrderService {
    //创建新订单
    Order create();
    //发起支付
    Order pay(int id);
    //订单发货
    Order deliver(int id);
    //订单收货
    Order receive(int id);
    //获取所有订单信息
    Map<Integer, Order> getOrders();
}
