package com.kknn.practice.pattern.strategy.promotion;

/**
 * 团购优惠
 *
 * @author kangfw5
 * @since 2019-07-18
 */
public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("组团购买，享受优惠价格");
    }
}
