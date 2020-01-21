package com.practice.design.pattern.behavioural.templateMethod;

import com.practice.design.pattern.behavioural.templateMethod.api.CrossCompiler;
import com.practice.design.pattern.behavioural.templateMethod.impl.AndroidCrossCompiler;
import com.practice.design.pattern.behavioural.templateMethod.impl.IPhoneCrossCompiler;

public class Main {

    public static void main(String[] args) {
        CrossCompiler iphoneCompiler = new IPhoneCrossCompiler();
        iphoneCompiler.crossCompile();

        CrossCompiler androidCompiler = new AndroidCrossCompiler();
        androidCompiler.crossCompile();
    }
}
