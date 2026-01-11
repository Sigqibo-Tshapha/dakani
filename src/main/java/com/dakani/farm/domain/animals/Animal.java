package com.dakani.farm.domain.animals;

import com.dakani.farm.domain.buildings.Building;
import jakarta.persistence.*;

import java.util.Date;

/**
 * Any animal that classifies as livestock and needs to be tracked
 */
@Entity
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int age;

    @Enumerated(EnumType.ORDINAL)
    private AnimalType type;
    private Date dateOfPurchase;
    private Date dateOfBirth;
    private double lifeSpan;
    private String name;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building hostBuilding;

    public Animal(int age, AnimalType type, Date dateOfPurchase, Date dateOfBirth, double lifeSpan, String name,
                  Building hostBuilding) {
        this.age = age;
        this.type = type;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfBirth = dateOfBirth;
        this.lifeSpan = lifeSpan;
        this.name = name;
        this.hostBuilding = hostBuilding;
    }

    public abstract Date getSlaughterDate();

    public abstract Date getMatureDate();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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
}
