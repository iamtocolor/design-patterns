package com.practice.design.pattern.structural.proxy.impl;

import com.practice.design.pattern.structural.proxy.api.Image;

public class RealImageImpl implements Image {

    public RealImageImpl(String imageUrl) {
        loadImage(imageUrl);
    }

    public void displayImage() {
        System.out.println("Image loaded and displayed");
    }

    private void loadImage(String imageUrl) {

    }
}
