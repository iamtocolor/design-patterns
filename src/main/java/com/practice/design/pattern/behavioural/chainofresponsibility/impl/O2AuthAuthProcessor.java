package com.practice.design.pattern.behavioural.chainofresponsibility.impl;

import com.practice.design.pattern.behavioural.chainofresponsibility.api.AuthenticationProcessor;
import com.practice.design.pattern.behavioural.chainofresponsibility.api.AuthenticationProvider;
import com.practice.design.pattern.behavioural.chainofresponsibility.impl.provider.AuthTokenProvider;

public class O2AuthAuthProcessor extends AuthenticationProcessor {


    public O2AuthAuthProcessor(AuthenticationProcessor processor) {
        super(processor);
    }

    @Override
    public boolean doAuthorize(AuthenticationProvider provider) {
        if (provider instanceof AuthTokenProvider) {
            System.out.println("doing O2auth");
            return true;
        } else if (processor != null) {
            return processor.doAuthorize(provider);
        }
        return false;
    }
}
