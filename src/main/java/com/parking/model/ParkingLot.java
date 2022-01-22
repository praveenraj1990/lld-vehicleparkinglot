package com.parking.model;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static ParkingLot parkingLot = new ParkingLot();

    @Getter
    List<ParkingFloor> list = new ArrayList<>();

    private ParkingLot(){

    }

    public static ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void addParkingFloor(ParkingFloor pf){
        list.add(pf);
    }

}
