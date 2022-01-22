package com.parking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public abstract class ParkingSpot {
    String id;
    int length;
    int width;
    SpotType spotType;

    Boolean available; //isFree

    ParkingFloor floor;

    Vehicle assignedVehicle;

    ParkingSpot(){
        this.id= UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSpot that = (ParkingSpot) o;
        return Objects.equals(id, that.id);
    }

}
