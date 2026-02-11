package com.logitech.domain.vehicle.exception;

public class VehicleCategoryNotDefinedException extends Exception{
    public VehicleCategoryNotDefinedException(String reason) {
        super("VehicleCategoryNotDefinedException:: " + reason);
    }
}
