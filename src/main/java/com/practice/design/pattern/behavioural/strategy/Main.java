package com.practice.design.pattern.behavioural.strategy;

import com.practice.design.pattern.behavioural.strategy.impl.CompressionContext;
import com.practice.design.pattern.behavioural.strategy.impl.RarCompression;
import com.practice.design.pattern.behavioural.strategy.impl.ZipCompression;

public class Main {
    public static void main(String[] args) {
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setStrategy(new ZipCompression());

        compressionContext.doCompress(null);

        compressionContext.setStrategy(new RarCompression());

        compressionContext.doCompress(null);
    }
}
