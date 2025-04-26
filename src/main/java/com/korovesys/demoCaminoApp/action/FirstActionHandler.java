package com.korovesys.demoCaminoApp.action;

import com.korovesys.camino.executor.AbstractActionHandler;

public class FirstActionHandler extends AbstractActionHandler {

    @Override
    public void execute() {
        System.out.println("first action handler");
    }
}
