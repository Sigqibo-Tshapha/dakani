package com.logitech.domain.terminal;

import com.logitech.domain.vehicle.Vehicle;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String location;

    @Enumerated
    private TerminalState state;

    @OneToMany(mappedBy = "baseTerminal", cascade = CascadeType.PERSIST)
    private List<Vehicle> vehicles = new ArrayList<>();

    public Terminal() {}

    public Terminal(String location, TerminalState state) {
        this.location = location;
        this.state = state;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @Override
    public String toString() {
        return "Terminal{"
                + "location=" + location
                + "id=" + id
                + ", state=" + state
                + '}';
    }
}
