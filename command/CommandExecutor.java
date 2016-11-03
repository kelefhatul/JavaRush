package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.Operation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 11/3/2016.
 */
public class CommandExecutor {
    private CommandExecutor() {
    }

    private static Map<Operation, Command> commandMap = new HashMap<>();

    static {
        commandMap.put(Operation.INFO, new InfoCommand());
        commandMap.put(Operation.DEPOSIT, new DepositCommand());
        commandMap.put(Operation.WITHDRAW, new WithdrawCommand());
        commandMap.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation){
        commandMap.get(operation).execute();
    }
}
