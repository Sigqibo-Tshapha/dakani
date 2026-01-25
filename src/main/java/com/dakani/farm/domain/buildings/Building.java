package com.dakani.farm.domain.buildings;

import com.dakani.farm.domain.animals.Animal;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ST. Any structure with capacity to hold animals or inventory
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String location;
    private double areaSqm;
    private double animalCapacity;

    @OneToMany(mappedBy = "hostBuilding")
    private Set<Animal> animalsStored = new HashSet<>();


    public Building(String location, double areaSqm, double animalCapacity) {
        this.location = location;
        this.areaSqm = areaSqm;
        this.animalCapacity = animalCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAreaSqm() {
        return areaSqm;
    }

    public void setAreaSqm(double areaSqm) {
        this.areaSqm = areaSqm;
    }

    public double getAnimalCapacity() {
        return animalCapacity;
    }

    public void setAnimalCapacity(double animalCapacity) {
        this.animalCapacity = animalCapacity;
    }

    public Set<Animal> getAnimalsStored() {
        return animalsStored;
    }

    public void setAnimalsStored(Set<Animal> animalsStored) {
        this.animalsStored = animalsStored;
    }
}
