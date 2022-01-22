package com.parking.service.impl;

import com.parking.exception.ParkingAttendantNotFoundException;
import com.parking.model.Panel;
import com.parking.model.ParkingAttendant;
import com.parking.service.ParkingAttendantService;

import java.util.HashMap;
import java.util.Map;

public class ParkingAttendantServiceImpl implements ParkingAttendantService {

    Map<String, ParkingAttendant> gatekeeperMap = new HashMap<>();

    public ParkingAttendant createParkingAttendant(String name, Panel panel){
        ParkingAttendant parkingAttendant = new ParkingAttendant(name, panel);
        gatekeeperMap.put(parkingAttendant.getId(), parkingAttendant);
        return parkingAttendant;
    }

    public ParkingAttendant getParkingAttendant(String gatekeeperId) throws ParkingAttendantNotFoundException {
        if(gatekeeperMap.get(gatekeeperId)==null){
            throw new ParkingAttendantNotFoundException();
        }else{
            return  gatekeeperMap.get(gatekeeperId);
        }
    }


}
