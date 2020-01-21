package com.practice.design.pattern.behavioural.templateMethod.api;

public abstract class CrossCompiler {
    //Declaring this as final
    public final void crossCompile() {
        collectSource();
        collectTarget();
    }

    protected abstract void collectSource();
    protected abstract void collectTarget();
}
