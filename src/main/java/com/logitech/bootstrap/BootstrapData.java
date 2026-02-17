package com.logitech.bootstrap;

import com.logitech.domain.terminal.Terminal;
import com.logitech.domain.vehicle.Vehicle;
import com.logitech.domain.vehicle.VehicleCategory;
import com.logitech.domain.vehicle.VehicleType;
import com.logitech.services.order.IOrderService;
import com.logitech.services.terminal.ITerminalService;
import com.logitech.services.vehicle.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

import static com.logitech.domain.terminal.TerminalState.OPERATIONAL;

@Component
public class BootstrapData  implements CommandLineRunner {
    private ITerminalService terminalService;
    private IVehicleService vehicleService;
    private IOrderService orderService;

    @Autowired
    public BootstrapData(ITerminalService terminalService, IVehicleService vehicleService, IOrderService orderService) {
        this.terminalService = terminalService;
        this.vehicleService = vehicleService;
        this.orderService = orderService;
    }


    @Override
    public void run(String... args) throws Exception {
        // Create terminal
        Terminal homeBase = new Terminal("Airport Industria", OPERATIONAL);

        // Add vehicles
        Vehicle.VehicleTag vehicleTag1 = new Vehicle.VehicleTag("LD76FF - GP", "19HDU3UHI2U3HEII3JJ");
        Vehicle truckOne = new Vehicle(VehicleType.TRUCK, vehicleTag1,
                VehicleCategory.LONGHAUL, homeBase);
        homeBase.addVehicle(truckOne);
        terminalService.saveTerminal(homeBase);

        System.out.println("BootstrapData::run():: Terminals= " + terminalService.findAll().stream()
                .map(terminal -> terminal.toString())
                .collect(Collectors.joining(",")));

    }
}
