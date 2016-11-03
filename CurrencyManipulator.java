package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 11/3/2016.
 */
public class CurrencyManipulator {
    private String currencyCode;
    private Map<Integer, Integer> denominations = new HashMap<>();
//    Map<Integer, Integer> denominations - это Map<номинал, количество>

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public void addAmount(int denomination, int count){
        if (denominations.containsKey(denomination)){
            denominations.put(denomination, denominations.get(denomination) + count);
        }else   denominations.put(denomination,count);
    }
    public int getTotalAmount(){
        int sum=0;
        for (Map.Entry<Integer, Integer> val: denominations.entrySet()) {
            sum +=val.getKey()*val.getValue();
        }
        return sum;
    }
}
