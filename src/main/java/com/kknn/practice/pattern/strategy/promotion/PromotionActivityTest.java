package com.kknn.practice.pattern.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * @author kangfw5
 * @since 2019-07-18
 */
public class PromotionActivityTest {
    public static void main(String[] args) {
        /*1.0
        PromotionActivity activity618 = new PromotionActivity(new CashBackStrategy());
        activity618.execute();
        PromotionActivity activity1111 = new PromotionActivity(new CouponStrategy());
        activity1111.execute();*/

        /*2.0
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";
        if (StringUtils.equals(promotionKey, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
            promotionActivity = new PromotionActivity(new CashBackStrategy());
        }
        promotionActivity.execute();*/


        String promotionKey = "GROUPBY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
