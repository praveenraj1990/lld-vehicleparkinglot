package com.parking.service.impl;

import com.parking.model.ParkingFloor;
import com.parking.model.ParkingSpot;
import com.parking.model.SpotType;
import com.parking.model.factory.ParkingSpotFactory;
import com.parking.service.ParkingSpotService;

import java.util.Map;

public class ParkingSpotServiceImpl implements ParkingSpotService {

    public static Map<String, ParkingSpot> map;

    public ParkingSpot getParkingSpot(String parkingSpotId){
        return  map.get(parkingSpotId);
    }

    @Override
    public ParkingSpot addParkingSpot(ParkingFloor pf, SpotType spotType, String desc) {
        ParkingSpot ps = ParkingSpotFactory.getParkingSpot(spotType);
        ps.setFloor(pf);
        pf.addParkingSpotType(ps);
        return ps;
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {
        map.remove(parkingSpot.getId());
    }





}
