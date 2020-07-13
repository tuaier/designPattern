package com.kknn.practice.pattern.state.order;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public enum OrderStatus {
    // 待支付      代发货         待收货         结束
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH
}
