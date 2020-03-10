package com.kknn.practice.pattern.adapter.passport.adapterv2.adapters;

import com.kknn.practice.pattern.adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForQQAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        //accesseToken
        //time
        return super.loginForRegist(id,null);
    }
}
