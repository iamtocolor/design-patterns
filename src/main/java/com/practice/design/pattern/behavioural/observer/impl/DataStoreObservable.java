package com.practice.design.pattern.behavioural.observer.impl;

import com.practice.design.pattern.behavioural.observer.api.SatishObservable;
import com.practice.design.pattern.behavioural.observer.api.SatishObserver;

import java.util.List;

public class DataStoreObservable extends SatishObservable {

    private String data;

    public DataStoreObservable() {
    }

    public void setData(String data) {
        this.data = data;
        notifyEveryObserver(this.data);
    }

    public String getData() {
        return data;
    }
}
