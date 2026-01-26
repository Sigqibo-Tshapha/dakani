package com.dakani.farm.domain.animals;

import com.dakani.farm.domain.buildings.Building;
import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Any animal that classifies as livestock and needs to be tracked
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_type")
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Embedded
    private AnimalTag tag;

    @Enumerated(EnumType.ORDINAL)
    private AnimalType type;
    private LocalDate dateOfPurchase;
    private LocalDate dateOfBirth;
    private double lifeSpan;
    private String name;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building hostBuilding;

    protected Animal() {
    }

    public Animal(AnimalType type, LocalDate dateOfPurchase, LocalDate dateOfBirth, double lifeSpan, String name,
                  Building hostBuilding) {
        this.type = type;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfBirth = dateOfBirth;
        this.lifeSpan = lifeSpan;
        this.name = name;
        this.hostBuilding = hostBuilding;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(double lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Building getHostBuilding() {
        return hostBuilding;
    }

    public void setHostBuilding(Building hostBuilding) {
        this.hostBuilding = hostBuilding;
    }

    @Override
    public String toString() {
        return String.join(",", new String[] {
                "id=" + id,
                ", type=" + type,
                ", dateOfPurchase=" + dateOfPurchase,
                ", dateOfBirth=" + dateOfBirth,
                ", lifeSpan=" + lifeSpan,
                ", name='" + name,
                ", hostBuilding=" + hostBuilding
                });
    }

    @Embeddable
    public record AnimalTag(int birthYear, String sequenceNumber, String rfidCode){}
}
