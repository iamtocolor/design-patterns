package com.practice.design.pattern.behavioural.templateMethod.impl;

import com.practice.design.pattern.behavioural.templateMethod.api.CrossCompiler;

public class IPhoneCrossCompiler extends CrossCompiler {

    @Override
    protected void collectSource() {
        System.out.println("IPhone Collect Source");
    }

    @Override
    protected void collectTarget() {
        System.out.println("IPhone Collect Target");
    }
}
