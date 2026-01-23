package com.dakani.farm.domain.inventory;

import com.dakani.farm.domain.animals.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    // Works for all animals for now, might need custom repositories when data gets too large
}
