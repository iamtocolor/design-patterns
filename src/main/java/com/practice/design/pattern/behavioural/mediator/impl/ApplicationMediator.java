package com.practice.design.pattern.behavioural.mediator.impl;

import com.practice.design.pattern.behavioural.mediator.api.Colleague;
import com.practice.design.pattern.behavioural.mediator.api.Mediator;

import java.util.List;

public class ApplicationMediator implements Mediator {

    private List<Colleague> colleagues;

    public ApplicationMediator(List<Colleague> colleagues) {
        this.colleagues = colleagues;
    }

    public void addColleage(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague colleague) {
        for (Colleague colleague1 : colleagues) {
            if (colleague1 != colleague) {
                colleague1.recieve(message);
            }
        }
    }
}
