package com.practice.design.pattern.structural.proxy;

import com.practice.design.pattern.structural.proxy.impl.ProxyImageImpl;

public class MainApp {

    public static void main(String[] args) {
        ProxyImageImpl proxyImage = new ProxyImageImpl("http://www.google.com");
        proxyImage.displayImage();
    }
}
