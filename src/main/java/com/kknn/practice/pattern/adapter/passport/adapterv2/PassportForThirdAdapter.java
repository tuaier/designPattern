package com.kknn.practice.pattern.adapter.passport.adapterv2;

import com.kknn.practice.pattern.adapter.passport.ResultMsg;
import com.kknn.practice.pattern.adapter.passport.adapterv2.adapters.*;

/**
 * @author kangfw5
 * @since 2020-03-10
 */
public class PassportForThirdAdapter implements IPassportForThird {
    /*@Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {

        return processLogin(openId, LoginForWechatAdapter.class);

    }

    @Override
    public ResultMsg loginForToken(String token) {

        return processLogin(token, LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }*/


    private ResultMsg processLogin(String id, String psd,Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ResultMsg login(String id, String psd,  Class<? extends ILoginAdapter> clazz) {
        return processLogin(id, psd, clazz);
    }
}
