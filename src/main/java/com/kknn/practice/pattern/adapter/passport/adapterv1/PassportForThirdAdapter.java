package com.kknn.practice.pattern.adapter.passport.adapterv1;

import com.kknn.practice.pattern.adapter.passport.PassportService;
import com.kknn.practice.pattern.adapter.passport.ResultMsg;

/**
 * @author kangfw5
 * @since 2020-03-10
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegister(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegister(openId,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegister(token,null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegister(phone,null);
    }

    private ResultMsg loginForRegister(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
