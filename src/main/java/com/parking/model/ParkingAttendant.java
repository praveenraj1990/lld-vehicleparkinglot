package com.parking.model;

import lombok.Getter;

@Getter
public class ParkingAttendant extends Account{

    Panel panel;

    public ParkingAttendant(String name, Panel panel){
        this.panel = panel;
    }

}
