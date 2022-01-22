package com.parking.model.factory;

import com.parking.model.EntryPanel;
import com.parking.model.ExitPanel;
import com.parking.model.Panel;
import com.parking.model.PanelType;

public class GateFactory {

    public static Panel getGate(PanelType gateType){
        switch(gateType){
            case Entry: return new EntryPanel();
            case Exit:return new ExitPanel();
        }

        return null;
    }
}
