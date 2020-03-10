package com.kknn.practice.pattern.adapter.passport.adapterv2;

import com.kknn.practice.pattern.adapter.passport.ResultMsg;
import com.kknn.practice.pattern.adapter.passport.adapterv2.adapters.ILoginAdapter;

/**
 * @author kangfw5
 * @since 2020-03-10
 */
public interface IPassportForThird {

    ResultMsg login(String id, String psd, Class<? extends ILoginAdapter> clazz);

    /*ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);*/

}
