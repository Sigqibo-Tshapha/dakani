package com.logitech.services.vehicle;

import com.logitech.domain.vehicle.Vehicle;
import com.logitech.domain.vehicle.exception.VehicleIdNotFoundException;
import com.logitech.repositories.vehicle.IVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Primary
@Service("truckService")
public class TruckVehicleServiceImpl implements IVehicleService{

    IVehicleRepository vehicleRepository;

    @Autowired
    public TruckVehicleServiceImpl(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(int id) throws VehicleIdNotFoundException {
        Vehicle v = vehicleRepository.findById(id).orElse(null);
        if (v.equals(null)) {
            throw new VehicleIdNotFoundException(id);
        }
        return v;
    }


    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(int id) {
        vehicleRepository.deleteById(id);
    }
}
