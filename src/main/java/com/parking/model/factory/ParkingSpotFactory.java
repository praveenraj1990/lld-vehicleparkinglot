package com.parking.model.factory;

import com.parking.model.CarSpot;
import com.parking.model.ParkingSpot;
import com.parking.model.SpotType;

public class ParkingSpotFactory {

    public static ParkingSpot getParkingSpot(SpotType spotType){

        switch(spotType){
            case CAR: return new CarSpot();
            default:
                 throw new RuntimeException("");
        }

    }

}
