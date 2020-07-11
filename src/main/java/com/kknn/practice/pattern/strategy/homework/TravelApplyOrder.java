package com.kknn.practice.pattern.strategy.homework;

import com.kknn.practice.pattern.strategy.pay.MsgResult;
import com.kknn.practice.pattern.strategy.pay.payport.PayStrategy;
import com.kknn.practice.pattern.strategy.pay.payport.Payment;

import java.util.ArrayList;
import java.util.List;

public class TravelApplyOrder {
    private String uid;
    private String applyNo;
    private ArrayList<String> cityList;

    public TravelApplyOrder(String uid, String applyNo, ArrayList<String> cityList) {
        this.uid = uid;
        this.applyNo = applyNo;
        this.cityList = cityList;
    }

    public List<String> getAllowCity(String mode) {
        IStayStrategy stayStrategy = StayCityMode.get(mode);
        return stayStrategy.getStayCity(cityList);
    }
}
