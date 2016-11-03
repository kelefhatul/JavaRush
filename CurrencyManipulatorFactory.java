package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;

/**
 * Created by root on 11/3/2016.
 */
public final class CurrencyManipulatorFactory {
    static HashMap<String, CurrencyManipulator> factoryMap = new HashMap<String, CurrencyManipulator>();

    private CurrencyManipulatorFactory() {
    }

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        CurrencyManipulator current;
        if (factoryMap.containsKey(currencyCode)){
            return factoryMap.get(currencyCode);
        }else {
            current = new CurrencyManipulator(currencyCode);
            factoryMap.put(currencyCode,current);
            return current;
        }
    }
}
