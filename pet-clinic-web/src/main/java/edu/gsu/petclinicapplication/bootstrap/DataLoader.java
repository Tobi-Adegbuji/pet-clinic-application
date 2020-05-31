package edu.gsu.petclinicapplication.bootstrap;

import edu.gsu.petclinicapplication.model.Owner;
import edu.gsu.petclinicapplication.model.Pet;
import edu.gsu.petclinicapplication.model.PetType;
import edu.gsu.petclinicapplication.model.Vet;
import edu.gsu.petclinicapplication.services.OwnerService;
import edu.gsu.petclinicapplication.services.PetTypeService;
import edu.gsu.petclinicapplication.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    //Implementing
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    //This is being INJECTED with ----"OwnerServiceMap"------ and OwnerServiceMap implements AbstractMap
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        //The save method returns a petType and also saves the petType to the database while giving the petType an ID
        PetType savedDogPrtType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPrtType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        owner1.setAddress("123 Example Lane");
        owner1.setCity("Atlanta");
        owner1.setTelephone("678-790-3333");

        Pet johnsDog = new Pet();
        johnsDog.setPetType(dog);
        johnsDog.setBirthDate(LocalDate.now());
        johnsDog.setName("Spike");
        owner1.getPets().add(johnsDog);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mary");
        owner2.setLastName("Doe");
        owner2.setAddress("2222 Brick Lane");
        owner2.setCity("Miami");
        owner2.setTelephone("565-564-3333");

        Pet marysCat = new Pet();
        marysCat.setPetType(cat);
        marysCat.setBirthDate(LocalDate.now());
        marysCat.setName("Luna");
        owner2.getPets().add(marysCat);

        ownerService.save(owner2);

        System.out.println("Owners Loaded");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ashley");
        vet1.setLastName("Hampton");

        vetService.save(vet1);

        Vet vet2 = new Vet();
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
*
* What we are essentially doing is creating 3 ways of persisting data.
* 1)Through a hash map * 2)Via JPA Data
* 3) ?
* */
