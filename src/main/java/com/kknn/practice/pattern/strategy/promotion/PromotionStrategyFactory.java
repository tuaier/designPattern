package com.kknn.practice.pattern.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangfw5
 * @since 2019-07-18
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBY, new GroupBuyStrategy());
    }

    private static final PromotionStrategy EMPTY_PROMOTION_STRATEGY = new EmptyStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? EMPTY_PROMOTION_STRATEGY : promotionStrategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBY = "GROUPBY";
    }
}
