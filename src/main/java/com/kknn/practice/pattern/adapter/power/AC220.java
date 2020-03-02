package com.kknn.practice.pattern.adapter.power;

/**
 * @author kangfw5
 * @since 2019-07-24
 */
public class AC220 {
    public int outputAC220() {
        int output = 220;
        System.out.println("输出电流" + output + "V");
        return output;
    }
}
