package com.practice.design.pattern.behavioural.strategy.api;

import java.util.List;

public interface CompressionStrategy {

    public void compress(List<String> files);
}
