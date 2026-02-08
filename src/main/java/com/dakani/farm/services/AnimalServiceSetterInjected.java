package com.dakani.farm.services;

import com.dakani.farm.domain.animals.Animal;
import com.dakani.farm.repositories.animals.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("animalServiceSetterInj")
public class AnimalServiceSetterInjected implements AnimalService{

    AnimalRepository animalRepository;
    @Override
    public Iterable<Animal> findAll() {
        return null;
    }


    @Qualifier("animalRepository")
    @Autowired
    public void setAnimalRepository(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }
}
