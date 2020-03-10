package com.kknn.practice.pattern.adapter.passport.adapterv2.adapters;

import com.kknn.practice.pattern.adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForWechatAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
