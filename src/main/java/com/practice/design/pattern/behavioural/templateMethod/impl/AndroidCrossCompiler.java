package com.practice.design.pattern.behavioural.templateMethod.impl;

import com.practice.design.pattern.behavioural.templateMethod.api.CrossCompiler;

public class AndroidCrossCompiler extends CrossCompiler {
    @Override
    protected void collectSource() {
        System.out.println("Android Collect Source");
    }

    @Override
    protected void collectTarget() {
        System.out.println("Android Collect Target");
    }
}
