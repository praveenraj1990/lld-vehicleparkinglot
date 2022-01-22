package com.parking.service;

import com.parking.exception.ParkingSpotNotAvailableException;
import com.parking.model.ParkingSpot;
import com.parking.model.SpotType;

public interface ParkingLotService {

    public ParkingSpot getParkingSpot(SpotType spotType) throws ParkingSpotNotAvailableException;

    public void vacateSpot(ParkingSpot spot);

}
