package com.logitech.domain.vehicle.exception;

public class VehicleIdNotFoundException extends Exception{
    public VehicleIdNotFoundException(int id) {
        super("Vehicle with ID:: " + id + ", not found in database.");
    }
}
