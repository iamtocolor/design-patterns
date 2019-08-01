package com.practice.design.pattern.behavioural.chainofresponsibility;

import com.practice.design.pattern.behavioural.chainofresponsibility.api.AuthenticationProcessor;
import com.practice.design.pattern.behavioural.chainofresponsibility.api.AuthenticationProvider;
import com.practice.design.pattern.behavioural.chainofresponsibility.impl.AuthTokenProvider;
import com.practice.design.pattern.behavioural.chainofresponsibility.impl.O2AuthAuthProcessor;
import com.practice.design.pattern.behavioural.chainofresponsibility.impl.UserNameAuthProcessor;

public class MainApp {

    public static void main(String[] args) {
        AuthenticationProvider provider = new AuthTokenProvider();

        AuthenticationProcessor authenticationProcessor = new UserNameAuthProcessor(new O2AuthAuthProcessor(null));
        AuthenticationProcessor otherProcessor = new O2AuthAuthProcessor(new UserNameAuthProcessor(null));

        System.out.println(authenticationProcessor.doAuthorize(provider));
    }

}

