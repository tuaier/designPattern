package com.kknn.practice.pattern.proxy.dbroute;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao插入Order成功");
        return 1;
    }
}
