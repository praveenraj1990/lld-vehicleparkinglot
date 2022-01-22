package com.parking.service;

import com.parking.model.PaymentType;
import com.parking.model.Ticket;

public interface PaymentService {

    void makePayment(Ticket ticket, PaymentType paymentType);

}
