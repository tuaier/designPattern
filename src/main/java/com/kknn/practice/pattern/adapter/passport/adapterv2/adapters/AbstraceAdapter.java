package com.kknn.practice.pattern.adapter.passport.adapterv2.adapters;

import com.kknn.practice.pattern.adapter.passport.PassportService;
import com.kknn.practice.pattern.adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
