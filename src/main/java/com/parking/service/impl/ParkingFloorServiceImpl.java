package com.parking.service.impl;

import com.parking.exception.ParkingFloorNotFoundException;
import com.parking.model.*;
import com.parking.model.factory.GateFactory;
import com.parking.service.ParkingFloorService;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ParkingFloorServiceImpl implements ParkingFloorService {

    public static Map<String, ParkingFloor> map;

    public ParkingFloor getParkingFloor(String parkingFloorId) throws ParkingFloorNotFoundException {
        if(map.get(parkingFloorId)==null){
            throw new ParkingFloorNotFoundException();
        }else{
            return  map.get(parkingFloorId);
        }
    }

    @Override
    public ParkingFloor addFloor(String desc) {
        ParkingFloor parkingFloor = new ParkingFloor(desc);
        map.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }

    @Override
    public Panel addEntrance(ParkingFloor parkingFloor, String description) {
        Panel entryPanel = GateFactory.getGate(PanelType.Entry);
        parkingFloor.addEntryGate(entryPanel);
        GateService.entryGateMap.put(entryPanel.getId(), entryPanel);
        return entryPanel;
    }

    @Override
    public Panel addExit(ParkingFloor parkingFloor, String description) {
        Panel exitPanel = GateFactory.getGate(PanelType.Exit);
        parkingFloor.addExitGate(exitPanel);
        GateService.exitGateMap.put(exitPanel.getId(), exitPanel);
        return exitPanel;

    }

    @Override
    public boolean isFull(ParkingFloor pf) {
        Map<SpotType, ConcurrentLinkedQueue<ParkingSpot>> map = pf.getParkingSpotList();
        for(SpotType st:SpotType.values()){
            if(map.get(st).size()>0){
                return false;
            }
        }
        return true;
    }

    public ParkingSpot getParkingSpot(ParkingFloor pf, SpotType spotType) {
        Queue<ParkingSpot> ps = pf.getParkingSpotList().get(spotType);
        if(!ps.isEmpty()){
            ParkingSpot ps1 = ps.poll();
            if(ps1==null){
                return null;
            }else{
                ps1.setAvailable(false);
                pf.getUsedParkingSpotList().put(ps1.getId(),ps1);
                return ps1;
            }
        }else{
            return null;
        }
    }

    public void vacateSpot(ParkingSpot spot){
        spot.getFloor().addParkingSpotType(spot);
        spot.getFloor().getUsedParkingSpotList().remove(spot.getId());
    }


}
