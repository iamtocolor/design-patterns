package com.practice.design.pattern.behavioural.nullobject;

import com.practice.design.pattern.behavioural.nullobject.impl.BankAccount;
import com.practice.design.pattern.behavioural.nullobject.impl.ConsoleLogger;
import com.practice.design.pattern.behavioural.nullobject.impl.NullObjectLogger;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        BankAccount bankAccount = new BankAccount(new NullObjectLogger(), 0);
        bankAccount.deposite(40);
    }
}
