package com.parking.model.factory;

import com.parking.model.TicketType;
import com.parking.service.impl.DailyPriceImpl;
import com.parking.service.impl.HourPrice;
import com.parking.service.PriceCompute;

public class PriceFactory {

    public static PriceCompute getPrice(TicketType ticketType){
        switch (ticketType){
            case DAILY:return new DailyPriceImpl();
            case HOURLY:return new HourPrice();
        }
        return null;
    }
}
