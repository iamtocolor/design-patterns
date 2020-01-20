package com.practice.design.pattern.behavioural.strategy.impl;

import com.practice.design.pattern.behavioural.strategy.api.CompressionStrategy;

import java.util.List;

public class CompressionContext {
    private CompressionStrategy strategy;

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void doCompress(List<String> files) {
        strategy.compress(files);
    }
}
