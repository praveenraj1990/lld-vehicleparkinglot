package com.parking.model;

public class ElectricSpot extends ParkingSpot {

    boolean isChargingAvailable;

    public ElectricSpot(){
        super();
        this.spotType=SpotType.EBIKE;
    }
}
