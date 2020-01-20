package com.practice.design.pattern.behavioural.strategy.impl;

import com.practice.design.pattern.behavioural.strategy.api.CompressionStrategy;

import java.util.List;

public class RarCompression implements CompressionStrategy {

    public void compress(List<String> files) {
        System.out.println("Compressing using RAR strategy");
    }
}
