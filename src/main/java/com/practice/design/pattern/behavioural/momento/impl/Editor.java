package com.practice.design.pattern.behavioural.momento.impl;

import com.practice.design.pattern.behavioural.momento.api.Momento;

public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Editor(String content) {
        this.content = content;
    }

    public Momento save() {
        return new EditorMomento(content);
    }

    public void restoreFromMomemto(Momento momento) {
        this.content = momento.getState();
    }
}
