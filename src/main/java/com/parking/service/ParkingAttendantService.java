package com.parking.service;

import com.parking.exception.ParkingAttendantNotFoundException;
import com.parking.model.Panel;
import com.parking.model.ParkingAttendant;

public interface ParkingAttendantService {

    public ParkingAttendant createParkingAttendant(String name, Panel panel);

    public ParkingAttendant getParkingAttendant(String parkingAttendantId) throws ParkingAttendantNotFoundException;

}
