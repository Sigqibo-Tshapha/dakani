package com.dakani.farm.domain.animals;

import com.dakani.farm.domain.buildings.Building;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@DiscriminatorValue("SHEEP")
public class Sheep extends Animal{

    private String woolQuality;
    public Sheep(int age, LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan, String name,
                 Building hostBuilding, String woolQuality) {
        super(age, AnimalType.BOVINE, dateOfPurchase, dateOfBirth, lifeSpan, name, hostBuilding);
        this.woolQuality = woolQuality;

    }

    @Override
    public LocalDate getSlaughterDate() {
        return getMatureDate().plusDays(1);
    }

    @Override
    public LocalDate getMatureDate() {
        return this.getDateOfBirth().plusMonths(8);
    }

    public String getWoolQuality() {
        return woolQuality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return Objects.equals(woolQuality, sheep.woolQuality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(woolQuality);
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "woolQuality='" + woolQuality + '\'' +
                ", " + super.toString() +
                "} " ;
    }
}
