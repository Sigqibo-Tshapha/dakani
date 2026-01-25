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

    public Sheep(LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan, String name,
                 Building hostBuilding) {
        super(AnimalType.BOVINE, dateOfPurchase, dateOfBirth, lifeSpan, name, hostBuilding);
    }

    public Sheep(LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan, String name,
                 Building hostBuilding, String woolQuality) {
        super(AnimalType.BOVINE, dateOfPurchase, dateOfBirth, lifeSpan, name, hostBuilding);
        this.woolQuality = woolQuality;
    }

    public String getWoolQuality() {
        return woolQuality;
    }

    public void setWoolQuality(String woolQuality) {
        this.woolQuality = woolQuality;
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
        return Objects.hash(super.hashCode(), woolQuality);
    }

    @Override
    public String toString() {
        return String.join(",", new String[] {
                "woolQuality='" + woolQuality,
                super.toString()
        });
    }
}
