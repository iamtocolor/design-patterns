package com.practice.design.pattern.behavioural.observer.impl;

import com.practice.design.pattern.behavioural.observer.api.SatishObservable;
import com.practice.design.pattern.behavioural.observer.api.SatishObserver;

public class ScreenObserver implements SatishObserver {

    public void update(SatishObservable satishObservable, String object) {
        System.out.println("Screen by" + this.getClass().getName() + " observing to " + satishObservable.getClass().getName() + " with this object " + object);
    }
}
