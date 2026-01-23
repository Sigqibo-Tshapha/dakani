package com.dakani.farm.domain.animals;

import com.dakani.farm.domain.buildings.Building;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Entity
@DiscriminatorValue("COW")
public class Cow extends Animal{
    private LocalDate matureDate;
    public Cow(int age, LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan, String name, Building building) {
        super(age, AnimalType.BOVINE, dateOfPurchase, dateOfBirth, lifeSpan, name, building);
        Calendar c = Calendar.getInstance();
        this.matureDate = dateOfBirth.plusYears(2);
    }

    @Override
    public LocalDate getMatureDate() {
        return this.matureDate;
    }

    @Override
    public LocalDate getSlaughterDate() {
        return this.matureDate.plusMonths(3);
    }
}
