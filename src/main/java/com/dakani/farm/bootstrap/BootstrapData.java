package com.dakani.farm.bootstrap;

import com.dakani.farm.domain.animals.Animal;
import com.dakani.farm.domain.animals.Chicken;
import com.dakani.farm.domain.animals.Cow;
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
    /*
    Spring auto-wires the repositories for us to use to create the entities we want
     */
    private AnimalRepository animalRepository;
    private BuildingRespository buildingRespository;

    public BootstrapData(AnimalRepository animalRepository, BuildingRespository buildingRespository) {
        this.animalRepository = animalRepository;
        this.buildingRespository = buildingRespository;
    }

    @Override
    public void run(String... args) throws Exception {

        /*
        NB: We need to first save the Building objects BEFORE the Animal objects because of the
        @OneToMany(mappedBy = "hostBuilding") & @ManyToOne relationships
         When saving the Animal to its repository, it first checks the Building being mapped to
         */
        Building coop1 = new Coop("Lot 0-0", 500, 500, null);
        Animal chic1 = new Chicken(LocalDate.now(), LocalDate.now(), 2, "Cornish 1", coop1);
        coop1.getAnimalsStored().add(chic1);
        buildingRespository.save(coop1);
        animalRepository.save(chic1);

        Building shed1 = new Shed("Lot 10-0", 500, 50, null);
        Animal bessy = new Cow(LocalDate.now(), LocalDate.now(), 24, "Bessy 1", shed1);
        shed1.getAnimalsStored().add(bessy);
        buildingRespository.save(shed1);
        animalRepository.save(bessy);

//        System.out.println("In BootstrapData");
//        System.out.println("Buildings count: " + buildingRespository.count());
//        System.out.println("Livestock count: " + animalRepository.count());
//        buildingRespository.findAll().forEach(b -> System.out.println(b.toString()));

    }
}
