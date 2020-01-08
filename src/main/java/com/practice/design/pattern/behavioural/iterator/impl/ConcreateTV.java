package com.practice.design.pattern.behavioural.iterator.impl;

import com.practice.design.pattern.behavioural.iterator.api.IIterator;
import com.practice.design.pattern.behavioural.iterator.api.TV;

import java.util.List;

public class ConcreateTV implements TV {
    List<String> channels;
    private IIterator iIterator;

    public ConcreateTV(List<String> channels) {
        this.channels = channels;
        this.iIterator = new IteratorImpl(channels);
    }

    public IIterator getIterator() {
        return iIterator;
    }
}
