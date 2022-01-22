package com.parking.model;

import java.util.UUID;

public class Vehicle {

    private String id;
    private String licenseNo;
    private VehicleType vehicleType;


    private Vehicle(String licenseNo){
        id= UUID.randomUUID().toString();
        this.licenseNo=licenseNo;
    }

}
