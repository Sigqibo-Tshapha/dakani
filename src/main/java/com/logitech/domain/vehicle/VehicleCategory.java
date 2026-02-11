package com.logitech.domain.vehicle;

import com.logitech.domain.vehicle.exception.VehicleCategoryNotDefinedException;

public enum VehicleCategory {
    LONGHAUL(1, "Long Range", 1000),
    LOCAL(2, "Local", 500);


    private final int id;
    private final String category;
    private final double maxRangeKM;

    VehicleCategory(int id, String category, double maxRangeKM) {
        this.id = id;
        this.category = category;
        this.maxRangeKM = maxRangeKM;
    }

    public int getId() {
        return id;
    }

    public String getCategory(int id) throws VehicleCategoryNotDefinedException {
        for (VehicleCategory vehicleCategory: VehicleCategory.values()) {
            if (vehicleCategory.id == id) return vehicleCategory.category;
        }
        throw new VehicleCategoryNotDefinedException("VehicleCategory with ID: " + id + ", not found.");
    }

    public double getMaxRangeKM() {
        return maxRangeKM;
    }
}
