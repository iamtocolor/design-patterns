package com.practice.design.pattern.behavioural.iterator.impl;

import com.practice.design.pattern.behavioural.iterator.api.IIterator;

import java.util.List;

public class IteratorImpl implements IIterator {
    private List<String> channels;

    public IteratorImpl(List<String> channels) {
        this.channels = channels;
    }

    public boolean hasNext() {
        return false;
    }

    public String getNext() {
        return channels.get(0);
    }
}
