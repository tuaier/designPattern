package com.kknn.practice.pattern.strategy.pay;

import com.kknn.practice.pattern.strategy.pay.payport.PayStrategy;

/**
 * @author kangfw5
 * @since 2019-07-18
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "20190718", (double) 1000);
        MsgResult result = order.pay(PayStrategy.ALI_PAY);
        System.out.println(result);
    }
}
