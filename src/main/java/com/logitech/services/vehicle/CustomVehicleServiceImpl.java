package com.logitech.services.vehicle;

import com.logitech.domain.vehicle.Vehicle;
import com.logitech.domain.vehicle.exception.VehicleIdNotFoundException;
import com.logitech.repositories.vehicle.IVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customVehicleService")
public class CustomVehicleServiceImpl implements IVehicleService{

    @Autowired  // Not recommended, this dependency has hidde visibility from instances. Rather use a constructor
    IVehicleRepository vehicleRepository;


    @Override
    public List<Vehicle> findAll() {
        System.out.println("CustomVehicleServiceImpl::findAll()...");
        return null;
    }

    @Override
    public Vehicle getVehicleById(int id) throws VehicleIdNotFoundException {
        System.out.println("CustomVehicleServiceImpl::getVehicleById()...");
        return null;
    }

    @Override
    public Vehicle saveVehicle(Vehicle Vehicle) {
        System.out.println("CustomVehicleServiceImpl::saveVehicle()...");
        return null;
    }

    @Override
    public void deleteVehicle(int id) {
        System.out.println("CustomVehicleServiceImpl::deleteVehicle()...");
    }

    @Autowired
    public void setVehicleRepository(IVehicleRepository vehicleRepository) {
        System.out.println("setter injection...slower, BAD practice!!!");
        this.vehicleRepository = vehicleRepository;
    }
}
