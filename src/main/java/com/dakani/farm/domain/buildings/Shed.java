package com.dakani.farm.domain.buildings;

import com.dakani.farm.domain.animals.Animal;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Set;

@Entity
@DiscriminatorValue("SHED")
public class Shed extends Building{
    private int milkingStations;

    public Shed(String location, double areaSqm, double animalCapacity, Set<Animal> animalsStored) {
        super(location, areaSqm, animalCapacity);
    }

    public int getMilkingStations() {
        return milkingStations;
    }

    public void setMilkingStations(int milkingStations) {
        this.milkingStations = milkingStations;
    }
}
