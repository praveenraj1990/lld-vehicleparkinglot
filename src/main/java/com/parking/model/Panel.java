package com.parking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Panel {
    String id;

    PanelType panelType;

    abstract void open();

    abstract void close();
}
