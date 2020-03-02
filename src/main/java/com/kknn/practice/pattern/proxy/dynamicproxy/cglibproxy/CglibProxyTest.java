package com.kknn.practice.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author kangfw5
 * @since 2019-06-28
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D://temp//cglib_proxy_classes");

            Customer obj = (Customer) new CglibMeipo().getInstance(Customer.class);
            System.out.println(obj);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
