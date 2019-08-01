package com.practice.design.pattern.structural.proxy.impl;

import com.practice.design.pattern.structural.proxy.api.Image;

public class ProxyImageImpl implements Image {

    private String url;

    public ProxyImageImpl(String url) {
        this.url = url;
    }

    public void displayImage() {
        RealImageImpl realImage = new RealImageImpl(url);
        realImage.displayImage();
    }
}
