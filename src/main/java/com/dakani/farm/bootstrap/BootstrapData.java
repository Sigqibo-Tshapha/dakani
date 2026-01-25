package com.dakani.farm.bootstrap;

import com.dakani.farm.domain.animals.Animal;
import com.dakani.farm.domain.animals.Chicken;
import com.dakani.farm.domain.buildings.Building;
import com.dakani.farm.domain.buildings.Coop;
import com.dakani.farm.domain.buildings.Shed;
import com.dakani.farm.repositories.animals.AnimalRepository;
import com.dakani.farm.repositories.buildings.BuildingRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BootstrapData  implements CommandLineRunner {
    private AnimalRepository animalRepository;
    private BuildingRespository buildingRespository;

    public BootstrapData(AnimalRepository animalRepository, BuildingRespository buildingRespository) {
        this.animalRepository = animalRepository;
        this.buildingRespository = buildingRespository;
    }

    @Override
    public void run(String... args) throws Exception {

        Building coop1 = new Coop("C1", 500, 500, null);
        Animal chic1 = new Chicken(LocalDate.now(), LocalDate.now(), 2, null, coop1);
        coop1.getAnimalsStored().add(chic1);
        buildingRespository.save(coop1);
        animalRepository.save(chic1);

        Building shed1 = new Shed("S1", 500, 50, null);
        Animal bessy = new Chicken(LocalDate.now(), LocalDate.now(), 24, null, shed1);
        shed1.getAnimalsStored().add(bessy);
        buildingRespository.save(shed1);
        animalRepository.save(bessy);

        System.out.println("In BootstrapData");
        System.out.println("Chicken count: " + coop1.getAnimalsStored().stream().count());
        System.out.println("Cattle count: " + shed1.getAnimalsStored().stream().count());

    }
}
