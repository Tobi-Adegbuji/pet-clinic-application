package edu.gsu.petclinicapplication.repositories;

import edu.gsu.petclinicapplication.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
