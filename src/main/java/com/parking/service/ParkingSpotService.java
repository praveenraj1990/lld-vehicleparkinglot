package com.parking.service;

import com.parking.exception.ParkingSpotNotFoundException;
import com.parking.model.ParkingFloor;
import com.parking.model.ParkingSpot;
import com.parking.model.SpotType;

public interface ParkingSpotService {

    public ParkingSpot addParkingSpot(ParkingFloor pf, SpotType spotType, String desc) ;

    public ParkingSpot getParkingSpot(String parkingSpotId) throws ParkingSpotNotFoundException;

    public void removeParkingSpot(ParkingSpot ps);

}
