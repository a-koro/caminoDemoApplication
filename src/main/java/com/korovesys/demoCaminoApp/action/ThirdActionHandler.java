package com.korovesys.demoCaminoApp.action;

import com.korovesys.camino.executor.AbstractActionHandler;

public class ThirdActionHandler extends AbstractActionHandler {

    @Override
    public void execute() {
        System.out.println("Third action handler");
    }
}
