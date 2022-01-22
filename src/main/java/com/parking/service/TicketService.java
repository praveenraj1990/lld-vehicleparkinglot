package com.parking.service;

import com.parking.exception.TicketNotFoundException;
import com.parking.model.*;

public interface TicketService {

    Ticket createTicket(ParkingAttendant user, Vehicle vehicle, Panel panel, TicketType ticketType, ParkingSpot ps);

    Ticket searchTicket(String ticketId) throws TicketNotFoundException;

    double getTicketCharges(Ticket ticket);

    Ticket updateTicketStatus(Ticket ticket, TicketStatus status, Panel panel);

}
