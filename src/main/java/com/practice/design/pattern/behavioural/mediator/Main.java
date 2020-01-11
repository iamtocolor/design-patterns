package com.practice.design.pattern.behavioural.mediator;

import com.practice.design.pattern.behavioural.mediator.api.Colleague;
import com.practice.design.pattern.behavioural.mediator.impl.ApplicationMediator;
import com.practice.design.pattern.behavioural.mediator.impl.DesktopColleague;
import com.practice.design.pattern.behavioural.mediator.impl.MobileColleague;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ApplicationMediator applicationMediator = new ApplicationMediator(new ArrayList<Colleague>());

        Colleague desktopColleague = new DesktopColleague(applicationMediator);
        Colleague mobileColleague = new MobileColleague(applicationMediator);

        applicationMediator.addColleage(desktopColleague);
        applicationMediator.addColleage(mobileColleague);

        desktopColleague.send("Satish Chnandra gupta from desktop to other");
        mobileColleague.send("Satish chandra gupta from mobile to other");

    }
}
