package com.parking.model;

import java.time.LocalDateTime;

public abstract class Payment {
    private String id;
    private Ticket ticket;
    private ParkingAttendant gatekeeper;
    private LocalDateTime initiatedDate;
    private LocalDateTime completedDate;
    private double amount;
    private PaymentStatus paymentStatus;

}
