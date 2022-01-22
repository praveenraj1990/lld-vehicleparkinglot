package com.parking.service;

import com.parking.model.Ticket;
import com.parking.model.ParkingAttendant;

public interface UserService {

    void payTicketCharges(ParkingAttendant user, Ticket ticket);

}
