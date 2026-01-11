package com.dakani.farm.domain.animals;

import com.dakani.farm.domain.buildings.Building;

import java.util.Date;

public class Cow extends Animal{
    public Cow(int age, Date dateOfPurchase, Date dateOfBirth, double lifeSpan, String name, Building building) {
        super(age, AnimalType.BOVINE, dateOfPurchase, dateOfBirth, lifeSpan, name, building);
    }

    @Override
    public Date getMatureDate() {
        return null;
    }

    @Override
    public Date getSlaughterDate() {
        return null;
    }
}
