package com.parking.service.impl;

import com.parking.exception.TicketNotFoundException;
import com.parking.model.*;
import com.parking.service.ParkingFloorService;
import com.parking.service.PriceCompute;
import com.parking.model.factory.PriceFactory;
import com.parking.service.TicketService;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class TicketServiceImpl implements TicketService {

    Map<String, Ticket> ticketMap = new HashMap<>();

    ParkingFloorService parkingFloorService;

    @Override
    public Ticket createTicket(ParkingAttendant user, Vehicle vehicle, Panel panel, TicketType ticketType, ParkingSpot ps) {
        Ticket ticket = new Ticket(user, vehicle, panel,ticketType,ps);
        ticketMap.put(ticket.getId(),ticket);
        return ticket;
    }

    @Override
    public Ticket searchTicket(String ticketId) throws TicketNotFoundException {
        Ticket ticket  =  ticketMap.get(ticketId);
        if(ticket==null){
            throw new TicketNotFoundException();
        }
        return ticket;
    }

    @Override
    public double getTicketCharges(Ticket ticket) {
        PriceCompute pc = PriceFactory.getPrice(ticket.getTicketType());
        return pc.compute(ticket);
    }

    @Override
    public Ticket updateTicketStatus(Ticket ticket, TicketStatus status, Panel panel) {
        PriceCompute pc = PriceFactory.getPrice(ticket.getTicketType());
        ticket.setEndTime(Instant.now());
        ticket.setExitPanel(panel);
        ticket.setCharges(pc.compute(ticket));
        ticket.setTicketStatus(status);
        ticket.getSpot().setAvailable(true);
        parkingFloorService.
        return ticket;
    }
}
