package com.korovesys.demoCaminoApp.action;

import com.korovesys.camino.executor.AbstractActionHandler;

public class SecondActionHandler extends AbstractActionHandler {

    @Override
    public void execute() {
        System.out.println("Second action handler");
    }
}
