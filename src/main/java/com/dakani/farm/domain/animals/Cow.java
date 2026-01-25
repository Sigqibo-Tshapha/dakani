package com.dakani.farm.domain.animals;

import com.dakani.farm.domain.buildings.Building;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@DiscriminatorValue("COW")
public class Cow extends Animal{

    private LocalDate matureDate;
    private String region;

    public Cow(LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan, String name, Building building) {
        super(AnimalType.BOVINE, dateOfPurchase, dateOfBirth, lifeSpan, name, building);
    }

    public Cow(LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan, String name, Building building,
               String region) {
        super(AnimalType.BOVINE, dateOfPurchase, dateOfBirth, lifeSpan, name, building);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    public LocalDate getMatureDate() {
        return matureDate;
    }

    public void setMatureDate(LocalDate matureDate) {
        this.matureDate = matureDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), region, matureDate);
    }

    @Override
    public String toString() {
        return String.join(",", new String[] {
                "region='" + region,
                "matureDate='" + matureDate,
                super.toString()
        });
    }
}
