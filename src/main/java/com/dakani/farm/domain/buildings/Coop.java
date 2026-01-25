package com.dakani.farm.domain.buildings;

import com.dakani.farm.domain.animals.Animal;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Set;

@Entity
@DiscriminatorValue("COOP")
public class Coop extends Building{
    private int chicCapacity;
    private boolean chicReady;
    private boolean nestingBoxCount;

    public Coop(String location, double areaSqm, double animalCapacity, Set<Animal> animalsStored) {
        super(location, areaSqm, animalCapacity);
    }

    public Coop(String location, double areaSqm, double animalCapacity, Set<Animal> animalsStored,
                int chicCapacity, boolean chicReady, boolean nestingBoxCount) {
        super(location, areaSqm, animalCapacity);
        this.chicCapacity = chicCapacity;
        this.chicReady = chicReady;
        this.nestingBoxCount = nestingBoxCount;
    }

    public int getChicCapacity() {
        return chicCapacity;
    }

    public void setChicCapacity(int chicCapacity) {
        this.chicCapacity = chicCapacity;
    }

    public boolean isChicReady() {
        return chicReady;
    }

    public void setChicReady(boolean chicReady) {
        this.chicReady = chicReady;
    }

    public boolean isNestingBoxCount() {
        return nestingBoxCount;
    }

    public void setNestingBoxCount(boolean nestingBoxCount) {
        this.nestingBoxCount = nestingBoxCount;
    }

}
