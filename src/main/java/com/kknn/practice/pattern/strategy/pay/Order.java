package com.kknn.practice.pattern.strategy.pay;

import com.kknn.practice.pattern.strategy.pay.payport.PayStrategy;
import com.kknn.practice.pattern.strategy.pay.payport.Payment;

/**
 * @author kangfw5
 * @since 2019-07-18
 */
public class Order {

    private String uid;
    private String orderId;
    private Double amount;

    public Order(String uid, String orderId, Double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println(payment.getName());
        System.out.println("本次交易金额：" + amount);
        return payment.pay(uid, amount);
    }
}
