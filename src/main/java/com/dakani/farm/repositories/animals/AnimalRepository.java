package com.dakani.farm.repositories.animals;

import com.dakani.farm.domain.animals.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
