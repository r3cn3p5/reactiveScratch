package com.p31prime.reactiveScratch;

import org.springframework.stereotype.Component;

@APRoute
public class ExampleRoute1 implements Route {


    @Override
    public String getName() {
        return "TrashPanda";
    }

    @Override
    public void execute() {

    }
}

