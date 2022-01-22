package com.parking.service;

import com.parking.model.Ticket;

public interface PriceCompute {

    Double compute(Ticket ticket);

}
