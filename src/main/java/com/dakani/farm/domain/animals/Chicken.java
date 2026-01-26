package com.dakani.farm.domain.animals;

import com.dakani.farm.domain.buildings.Building;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("CHICKEN")
public class Chicken extends Animal{

    protected Chicken() {
        // Required by JPA
    }


    public Chicken(LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan,
                   String name, Building hostBuilding) {
        super(AnimalType.CHICKEN, dateOfPurchase, dateOfBirth, lifeSpan, name, hostBuilding);
    }
}
