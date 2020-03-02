package com.kknn.practice.pattern.strategy.promotion;

/**
 * 无优惠
 *
 * @author kangfw5
 * @since 2019-07-18
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
