package com.kknn.practice.pattern.strategy.pay.payport;

/**
 * @author kangfw5
 * @since 2019-07-18
 */
public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 1200;
    }
}
