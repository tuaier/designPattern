package com.kknn.practice.pattern.strategy.promotion;

/**
 * 优惠券优惠
 *
 * @author kangfw5
 * @since 2019-07-18
 */
public class CouponStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程实际价格 = 原价格 - 优惠券价格");
    }
}
