package com.parking.utility;

import com.parking.model.SpotType;
import com.parking.model.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class MapSpotType {

    public static List<SpotType> spotTypeApplicableForVehicle(VehicleType vehicleType) {
        List<SpotType> list = new ArrayList<>();
        switch (vehicleType) {
            case CAR: list.add(SpotType.CAR);
            case ELECTRIC:list.add(SpotType.ELECTRIC);
            case MOTORBIKE:list.add(SpotType.MOTORBIKE);
            default:list.add(SpotType.LARGE);
        }
        return list;
    }
}
