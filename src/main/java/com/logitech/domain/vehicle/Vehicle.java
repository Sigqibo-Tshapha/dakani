package com.logitech.domain.vehicle;

import com.logitech.domain.terminal.Terminal;
import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vehicle_type")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Embedded
    private VehicleTag vehicleTag;

    @Enumerated
    private VehicleCategory category;
    private VehicleType type;

    @ManyToOne
    @JoinColumn(name = "terminal")
    private Terminal baseTerminal;

    public Vehicle() {}


    public Vehicle(VehicleType type, VehicleTag vehicleTag, VehicleCategory category, Terminal baseTerminal) {
        this.type = type;
        this.vehicleTag = vehicleTag;
        this.category = category;
        this.baseTerminal = baseTerminal;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleTag=" + vehicleTag.toString() +
                ", category=" + category +
                ", type=" + type +
                ", baseTerminal=" + baseTerminal +
                '}';
    }

    @Embeddable
    public static class VehicleTag{
        private String numPlate;
        private String VIN;

        VehicleTag(){}

        @Override
        public String toString() {
            return "VehicleTag: {"
                    + numPlate
                    + ", " + VIN
                    + "}";
        }

        public VehicleTag(String numPlate, String VIN) {
            this.numPlate = numPlate;
            this.VIN = VIN;
        }
    }
}
