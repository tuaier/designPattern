package com.kknn.practice.pattern.adapter.power;

/**
 * @author kangfw5
 * @since 2019-07-24
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
