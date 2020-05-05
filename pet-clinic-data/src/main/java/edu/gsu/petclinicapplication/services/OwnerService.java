package edu.gsu.petclinicapplication.services;

import edu.gsu.petclinicapplication.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();
    Owner findById(long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
