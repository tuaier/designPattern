package com.kknn.practice.pattern.strategy.promotion;

/**
 * 返现优惠
 *
 * @author kangfw5
 * @since 2019-07-18
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现，现金返回到账户");
    }
}
