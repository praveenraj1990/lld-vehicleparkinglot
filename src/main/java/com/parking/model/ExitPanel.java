package com.parking.model;

import java.util.UUID;

public class ExitPanel extends Panel {

    public ExitPanel(){
        this.id=UUID.randomUUID().toString();
        panelType= PanelType.Entry;
    }

    @Override
    void open() {

    }

    @Override
    void close() {

    }
}
