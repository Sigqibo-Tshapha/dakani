package com.logitech.domain.vehicle;

import com.logitech.domain.vehicle.exception.VehicleCategoryNotDefinedException;

public enum VehicleType {
    TRUCK(1, "Truck", 1.0E4),
    CAR(2, "Car", 500),
    SHIP(3, "Ship", 1.0E6);


    private final int id;
    private final String category;
    private final double maxPayloadKG;

    VehicleType(int id, String category, double maxPayloadKG) {
        this.id = id;
        this.category = category;
        this.maxPayloadKG = maxPayloadKG;
    }

    public int getId() {
        return id;
    }

    public String getCategory(int id) throws VehicleCategoryNotDefinedException {
        for (VehicleType vehicleCategory: VehicleType.values()) {
            if (vehicleCategory.id == id) return vehicleCategory.category;
        }
        throw new VehicleCategoryNotDefinedException("VehicleType with ID: " + id + ", not found.");
    }

    public double getMaxPayloadKG() {
        return maxPayloadKG;
    }
}
