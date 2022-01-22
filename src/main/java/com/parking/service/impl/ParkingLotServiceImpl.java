package com.parking.service.impl;

import com.parking.exception.ParkingSpotNotAvailableException;
import com.parking.model.ParkingFloor;
import com.parking.model.ParkingLot;
import com.parking.model.ParkingSpot;
import com.parking.model.SpotType;
import com.parking.service.ParkingFloorService;
import com.parking.service.ParkingLotService;

import java.util.List;

public class ParkingLotServiceImpl implements ParkingLotService {

    ParkingFloorService parkingFloorService;

    public ParkingLot getParkingLot(){
        return ParkingLot.getParkingLot();
    }

    public ParkingSpot getParkingSpot(SpotType spotType) throws ParkingSpotNotAvailableException {
        ParkingLot pl = ParkingLot.getParkingLot();
        List<ParkingFloor> pfs  = pl.getList();
        for(ParkingFloor pf : pfs){
            ParkingSpot ps = parkingFloorService.getParkingSpot(pf, spotType);
            if(ps!=null){
                return ps;
            }
        }

        throw new ParkingSpotNotAvailableException();

    }

    @Override
    public void vacateSpot(ParkingSpot spot) {
        parkingFloorService.vacateSpot(spot);
    }

}
