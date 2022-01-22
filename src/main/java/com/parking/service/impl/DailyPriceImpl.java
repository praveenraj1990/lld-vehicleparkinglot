package com.parking.service.impl;

import com.parking.model.Ticket;
import com.parking.service.PriceCompute;

public class DailyPriceImpl implements PriceCompute {

    @Override
    public Double compute(Ticket ticket)
    {
        final double v = 1.0;
        return v;
    }

}
