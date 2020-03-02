package com.kknn.practice.pattern.strategy.pay.payport;

import com.kknn.practice.pattern.strategy.pay.MsgResult;

/**
 * @author kangfw5
 * @since 2019-07-18
 */
public abstract class Payment {
    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        } else {
            return new MsgResult(200, "支付成功", "支付金额：" + amount);
        }
    }
}
