package edu.gsu.petclinicapplication.bootstrap;

import edu.gsu.petclinicapplication.model.Owner;
import edu.gsu.petclinicapplication.model.Vet;
import edu.gsu.petclinicapplication.services.OwnerService;
import edu.gsu.petclinicapplication.services.VetService;
import edu.gsu.petclinicapplication.services.map.OwnerServiceMap;
import edu.gsu.petclinicapplication.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    //Implementing
    private final OwnerService ownerService;
    private final VetService vetService;

    //We will later make spring configure this for us
    public DataLoader() {
    ownerService = new OwnerServiceMap();
    vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mary");
        owner2.setLastName("Doe");

        ownerService.save(owner2);

        System.out.println("Owners Loaded");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ashley");
        vet1.setLastName("Hampton");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Josh");
        vet2.setLastName("Peck");

        vetService.save(vet2);

        System.out.println("Vets Loaded");

    }
}

/*
* The Component annotation allows the DataLoader to be created as a bean in the spring context
* B/c this class implements CommandLineRunner, after the spring context loads the overidden run method will
* run everything inside of it.
* */
