package com.kknn.practice.pattern.adapter.passport.adapterv2.adapters;

import com.kknn.practice.pattern.adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
