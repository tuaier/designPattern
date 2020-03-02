package com.kknn.practice.pattern.strategy.promotion;

/**
 * 优惠活动
 *
 * @author kangfw5
 * @since 2019-07-18
 */
public class PromotionActivity {

    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        promotionStrategy.doPromotion();
    }
}
