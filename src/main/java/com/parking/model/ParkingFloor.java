package com.parking.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

@Getter
@Setter
public class ParkingFloor {

    String id;

    String desc;

    Map<SpotType, ConcurrentLinkedQueue<ParkingSpot>> parkingSpotList = new HashMap<>();

    Map<String, ParkingSpot> usedParkingSpotList = new HashMap<>();

    List<Panel> entryPanels = new ArrayList<>();

    List<Panel> exitPanels = new ArrayList<>();

    void addParkingSpot(ParkingSpot pf){
        parkingSpotList.get(pf.getSpotType()).add(pf);
    }

    public ParkingFloor(String desc) {
        this.id = UUID.randomUUID().toString();
        this.desc = desc;
        for(SpotType spotType:SpotType.values()){
            parkingSpotList.put(spotType,new ConcurrentLinkedQueue<>());
        }
    }

    public void addParkingSpotType(ParkingSpot parkingSpot){
        parkingSpotList.get(parkingSpot.getSpotType()).add(parkingSpot);
    }

    public void removeParkingSpotType(ParkingSpot parkingSpot){
        parkingSpotList.get(parkingSpot.getSpotType()).remove(parkingSpot);
    }

    public void addEntryGate(Panel panel){
        entryPanels.add(panel);
    }

    public void addExitGate(Panel panel){
        exitPanels.add(panel);
    }

}
