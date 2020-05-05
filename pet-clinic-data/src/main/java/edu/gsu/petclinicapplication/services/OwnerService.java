package edu.gsu.petclinicapplication.services;

import edu.gsu.petclinicapplication.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName();

}
