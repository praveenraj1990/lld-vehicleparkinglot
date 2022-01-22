package com.parking.model;

import java.util.UUID;

public class EntryPanel extends Panel {


    public EntryPanel(){
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
