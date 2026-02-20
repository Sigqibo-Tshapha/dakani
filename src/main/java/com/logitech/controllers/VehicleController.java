package com.logitech.controllers;

import com.logitech.services.vehicle.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class VehicleController {

    @Autowired
    @Qualifier("customVehicleService")
    IVehicleService vehicleService;


    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping("/vehicles")
    public String getVehicles(Model model) {
        model.addAttribute("vehicles", vehicleService.findAll());
        return "vehicles";
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
