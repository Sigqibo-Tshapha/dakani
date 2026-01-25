package com.dakani.farm.repositories.buildings;

import com.dakani.farm.domain.buildings.Building;
import org.springframework.data.repository.CrudRepository;

public interface BuildingRespository extends CrudRepository<Building, Integer> {
}
