package com.kknn.practice.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付策略
 *
 * @author kangfw5
 * @since 2019-07-18
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(JD_PAY, new JDPay());
        payStrategy.put(WECHAT_PAY, new WeChatPay());

    }

    /**
     * 通过统一入口实现动态策略
     *
     * @param payKey 支付类型
     * @return
     */
    public static Payment get(String payKey) {
        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }

}
