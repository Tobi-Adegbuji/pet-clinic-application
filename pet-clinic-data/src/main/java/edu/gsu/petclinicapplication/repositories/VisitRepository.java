package edu.gsu.petclinicapplication.repositories;

import edu.gsu.petclinicapplication.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
