package com.parking.service;

import com.parking.exception.ParkingFloorNotFoundException;
import com.parking.model.Panel;
import com.parking.model.ParkingFloor;
import com.parking.model.ParkingSpot;
import com.parking.model.SpotType;

public interface ParkingFloorService {

    public ParkingFloor getParkingFloor(String parkingFloorId) throws ParkingFloorNotFoundException;

    ParkingFloor addFloor(String description);

    Panel addEntrance(ParkingFloor parkingFloorId, String description);

    Panel addExit(ParkingFloor parkingFloorId, String description);

    boolean isFull(ParkingFloor pf);

    public ParkingSpot getParkingSpot(ParkingFloor pf, SpotType spotType);

    void vacateSpot(ParkingSpot spot);


}
