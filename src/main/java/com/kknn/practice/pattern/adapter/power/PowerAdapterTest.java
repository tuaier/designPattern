package com.kknn.practice.pattern.adapter.power;

/**
 * @author kangfw5
 * @since 2019-07-24
 */
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5();
    }
}
