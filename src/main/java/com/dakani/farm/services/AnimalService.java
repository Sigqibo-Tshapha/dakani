package com.dakani.farm.services;

import com.dakani.farm.domain.animals.Animal;

public interface AnimalService {
    Iterable<Animal> findAll();
}
