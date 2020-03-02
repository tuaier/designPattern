package com.kknn.practice.pattern.proxy.dbroute;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class OrderServiceImpl implements IOrderService {
    private OrderDao orderDao;

    public OrderServiceImpl() {
        this.orderDao = new OrderDao();
    }

    @Override
    public int insertOrder(Order order) {
        System.out.println("OrderService调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
