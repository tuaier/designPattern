package com.kknn.practice.pattern.adapter.passport.adapterv1;

import com.kknn.practice.pattern.adapter.passport.ResultMsg;

/**
 * @author kangfw5
 * @since 2020-03-10
 */
public interface IPassportForThird {
    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone,String code);
}
