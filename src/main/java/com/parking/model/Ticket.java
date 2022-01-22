package com.parking.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class Ticket {
    private String id;
    private Instant startTime;
    @Setter
    private Instant endTime;
    private ParkingAttendant parkingAttendant;
    private Vehicle vehicle;
    @Setter
    private double charges;
    private Panel entryPanel;
    @Setter
    private Panel exitPanel;

    @Setter
    TicketStatus ticketStatus;

    TicketType ticketType;

    ParkingSpot spot;

    public Ticket(ParkingAttendant parkingAttendant, Vehicle vehicle, Panel panel, TicketType tickeTyp, ParkingSpot spot){
        this.id= UUID.randomUUID().toString();
        this.parkingAttendant = parkingAttendant;
        this.startTime= Instant.now();
        this.vehicle=vehicle;
        this.entryPanel = panel;
        this.ticketStatus=TicketStatus.ACTIVE;
        this.ticketType=tickeTyp;
        this.spot=spot;
    }
}
