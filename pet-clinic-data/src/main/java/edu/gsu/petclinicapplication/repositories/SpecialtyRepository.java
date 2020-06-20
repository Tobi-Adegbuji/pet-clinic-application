package edu.gsu.petclinicapplication.repositories;

import edu.gsu.petclinicapplication.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository  extends CrudRepository<Specialty, Long> {
}
