package com.parking.service.impl;

import com.parking.model.SpotType;
import com.parking.model.Ticket;
import com.parking.service.PriceCompute;

import java.util.HashMap;
import java.util.Map;

public class HourPrice implements PriceCompute {

    private Map<SpotType, Double> hourlyCosts = new HashMap<>();

    public void HourlyCost() {
        hourlyCosts.put(SpotType.CAR, 20.0);
        hourlyCosts.put(SpotType.LARGE, 30.0);
        hourlyCosts.put(SpotType.ELECTRIC, 25.0);
        hourlyCosts.put(SpotType.MOTORBIKE, 10.0);
    }

    @Override
    public Double compute(Ticket ticket) {
        return hourlyCosts.get(ticket.getSpot().getSpotType());
    }
}
