package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 11/3/2016.
 */
public class ConsoleHelper {
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static String readString(){
        String inData = "";
        try {
            inData = keyboard.readLine();
        } catch (IOException e) {
            /*NOP*/
        }
        return inData;
    }
    public  static String askCurrencyCode(){
        writeMessage("Input currency code, must be 3 letters:");
        String currencyCode;
            while (true){
                currencyCode  = readString();
                if (currencyCode.length() == 3) {
                    break;
                }
                else
                    writeMessage("Incorrect currency code, try one more time! Must be 3 letters");
            }
        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode){
        writeMessage("Input data in next order: \"nominal\" \"the number of banknotes\"");
        String[] nominalAndQuantity = new String[2];
            while(true) {
                nominalAndQuantity = readString().split(" ");
                if (nominalAndQuantity.length == 2) {
                    int nominal = Integer.parseInt(nominalAndQuantity[0]);
                    int quantity = Integer.parseInt(nominalAndQuantity[1]);
                    if (nominal <= 0 || quantity <= 0 ){
                        continue;
                    }
                    break;
                } else {
                    writeMessage("incorrect nominalAndQuantity");
                }
            }
        return nominalAndQuantity;
    }
    public static Operation askOperation(){
        writeMessage("Choose operation type:");
        while (true){
            String inOperation = readString();
            if (inOperation != null) {
                return Operation.getAllowableOperationByOrdinal(Integer.parseInt(inOperation));
            }else writeMessage("Need to choose operation");

        }
    }




}
