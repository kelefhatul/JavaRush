package com.javarush.test.level26.lesson15.big01;

import java.util.Locale;


/**
 * Created by root on 11/3/2016.
 */
public class CashMachine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        ConsoleHelper consoleHelper = new ConsoleHelper();
        String currencyCode = consoleHelper.askCurrencyCode();
        String[] test1 = consoleHelper.getValidTwoDigits(currencyCode);

        CurrencyManipulator curman = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        curman.addAmount(Integer.parseInt(test1[0]), Integer.parseInt(test1[1]));
        System.out.println(curman.getTotalAmount());




    }
}
