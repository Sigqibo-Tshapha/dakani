package com.dakani.farm.domain.buildings;

import com.dakani.farm.domain.animals.Animal;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

/**
 * ST. Any structure with capacity to hold animals or inventory
 */
@Entity
public abstract class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double areaSqm;
    private double animalCapacity;
    @OneToMany(mappedBy = "hostBuilding")
    private Set<Animal> animalsStored;
}
