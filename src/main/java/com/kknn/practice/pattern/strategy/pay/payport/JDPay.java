package com.kknn.practice.pattern.strategy.pay.payport;

/**
 * @author kangfw5
 * @since 2019-07-18
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
