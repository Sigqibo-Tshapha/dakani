package com.logitech.services.vehicle;

import com.logitech.domain.terminal.Terminal;
import com.logitech.domain.vehicle.Vehicle;
import com.logitech.domain.vehicle.exception.VehicleIdNotFoundException;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> findAll();

    Vehicle getVehicleById(int id) throws VehicleIdNotFoundException;

    Vehicle saveVehicle(Vehicle Vehicle);

    void deleteVehicle(int id);
}
