package com.practice.design.pattern.behavioural.observer.api;

import java.util.ArrayList;
import java.util.List;

public abstract class SatishObservable {

    private List<SatishObserver> observers;

    public SatishObservable() {
        this.observers = new ArrayList<SatishObserver>();
    }

    public void addObserver(SatishObserver satishObserver) {
        this.observers.add(satishObserver);
    }

    protected void notifyEveryObserver(String data) {
        for (SatishObserver satishObserver : observers) {
            satishObserver.update(this, data);
        }
    }
}
