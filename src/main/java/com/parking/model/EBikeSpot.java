package com.parking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EBikeSpot extends ParkingSpot{

    boolean isChargingAvailable;

    public EBikeSpot(){
        super();
        this.spotType=SpotType.EBIKE;
    }


}
