package com.kknn.practice.pattern.adapter.passport.adapterv2;

import com.kknn.practice.pattern.adapter.passport.adapterv2.adapters.LoginForQQAdapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.login("id", "psd", LoginForQQAdapter.class);
    }
}
