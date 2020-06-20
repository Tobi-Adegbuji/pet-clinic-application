package edu.gsu.petclinicapplication.repositories;

import edu.gsu.petclinicapplication.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
