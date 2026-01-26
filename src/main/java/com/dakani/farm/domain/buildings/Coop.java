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
    private int nestingBoxCount;

    protected Coop() {
    }

    public Coop(String location, double areaSqm, double animalCapacity, Set<Animal> animalsStored) {
        super(location, areaSqm, animalCapacity);
    }

    public Coop(String location, double areaSqm, double animalCapacity, Set<Animal> animalsStored,
                int chicCapacity, boolean chicReady, int nestingBoxCount) {
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

    public int isNestingBoxCount() {
        return nestingBoxCount;
    }

    public void setNestingBoxCount(int nestingBoxCount) {
        this.nestingBoxCount = nestingBoxCount;
    }

    @Override
    public String toString() {
        return String.join(", ",
                super.toString(),
                "chicCapacity=" + chicCapacity,
                "chicReady=" + chicReady,
                "nestingBoxCount=" + nestingBoxCount);
    }
}
