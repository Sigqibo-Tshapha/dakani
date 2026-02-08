package com.dakani.farm.services;

import com.dakani.farm.domain.animals.Animal;
import com.dakani.farm.domain.animals.Cow;
import com.dakani.farm.repositories.animals.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Primary
@Service
public class AnimalServicePrimary implements AnimalService{

    @Autowired
    AnimalRepository animalRepository;
    @Override
    public Iterable<Animal> findAll() {
        return animalRepository.findAll();
    }
}
