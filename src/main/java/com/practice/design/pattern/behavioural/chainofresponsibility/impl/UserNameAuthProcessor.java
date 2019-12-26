package com.practice.design.pattern.behavioural.chainofresponsibility.impl;

import com.practice.design.pattern.behavioural.chainofresponsibility.api.AuthenticationProcessor;
import com.practice.design.pattern.behavioural.chainofresponsibility.api.AuthenticationProvider;
import com.practice.design.pattern.behavioural.chainofresponsibility.impl.provider.UserNameAuthProvider;

public class UserNameAuthProcessor extends AuthenticationProcessor {

    public UserNameAuthProcessor(AuthenticationProcessor processor) {
        super(processor);
    }

    @Override
    public boolean doAuthorize(AuthenticationProvider provider) {
        if (provider instanceof UserNameAuthProvider) {
            System.out.println("doing username auth");
            return true;
        } else if (processor != null) {
            return processor.doAuthorize(provider);
        }
        return false;
    }
}
