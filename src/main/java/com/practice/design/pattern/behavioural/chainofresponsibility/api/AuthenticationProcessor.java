package com.practice.design.pattern.behavioural.chainofresponsibility.api;


public abstract class AuthenticationProcessor {

    protected AuthenticationProcessor processor;

    public AuthenticationProcessor(AuthenticationProcessor processor) {
        this.processor = processor;
    }

    public abstract boolean doAuthorize(AuthenticationProvider provider);

}
