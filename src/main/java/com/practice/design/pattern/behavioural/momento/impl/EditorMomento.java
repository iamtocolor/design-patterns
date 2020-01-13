package com.practice.design.pattern.behavioural.momento.impl;

import com.practice.design.pattern.behavioural.momento.api.Momento;

public class EditorMomento implements Momento {
    private String state;

    public EditorMomento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
