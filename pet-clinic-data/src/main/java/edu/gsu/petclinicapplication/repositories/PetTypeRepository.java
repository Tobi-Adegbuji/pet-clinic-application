package edu.gsu.petclinicapplication.repositories;

import edu.gsu.petclinicapplication.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
