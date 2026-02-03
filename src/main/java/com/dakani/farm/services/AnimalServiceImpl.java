package com.dakani.farm.services;

import com.dakani.farm.domain.animals.Animal;
import com.dakani.farm.repositories.animals.AnimalRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Iterable<Animal> findAll() {
        return animalRepository.findAll();
    }
}
