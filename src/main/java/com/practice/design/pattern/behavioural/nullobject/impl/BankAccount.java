package com.practice.design.pattern.behavioural.nullobject.impl;

import com.practice.design.pattern.behavioural.nullobject.api.Log;

public class BankAccount {
    private Log log;
    private Integer balance;

    public BankAccount(Log log, Integer balance) {
        this.log = log;
        this.balance = balance;
    }

    public void deposite(int value) {
        balance += value;
        log.info("Deposited " + value);
    }
}
