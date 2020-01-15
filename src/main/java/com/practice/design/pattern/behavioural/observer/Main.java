package com.practice.design.pattern.behavioural.observer;

import com.practice.design.pattern.behavioural.observer.api.SatishObservable;
import com.practice.design.pattern.behavioural.observer.api.SatishObserver;
import com.practice.design.pattern.behavioural.observer.impl.DataStoreObservable;
import com.practice.design.pattern.behavioural.observer.impl.ScreenObserver;
import com.practice.design.pattern.behavioural.observer.impl.UIObserver;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        SatishObserver satishObserver = new ScreenObserver();
        UIObserver uiObserver= new UIObserver();

        DataStoreObservable dataStoreObservable = new DataStoreObservable();
        dataStoreObservable.addObserver(satishObserver);
        dataStoreObservable.addObserver(uiObserver);

        dataStoreObservable.setData("Satish");
        dataStoreObservable.setData("chandra");
        dataStoreObservable.setData("gupta");
    }
}
